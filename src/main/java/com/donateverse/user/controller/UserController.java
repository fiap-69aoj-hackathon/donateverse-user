package com.donateverse.user.controller;

import com.donateverse.user.dto.UserRequest;
import com.donateverse.user.dto.UserResponse;
import com.donateverse.user.entity.UserEntity;
import com.donateverse.user.service.TokenAuthenticationService;
import com.donateverse.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.Optional;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 20/10/2019 22:45
 */
@RestController
@RequestMapping("/users")
@Api(value = "Usuários", tags = {"API de usuários"})
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private TokenAuthenticationService tokenAuthenticationService;

    @ApiOperation(value = "Insere um novo usuário")
    @PostMapping
    public ResponseEntity<UserResponse> save(@Valid @RequestBody final UserRequest userRequest) {
        final UserResponse userResponse = userService.save(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @ApiOperation(value = "Busca um usuário por e-mail e senha")
    @GetMapping
    public ResponseEntity<UserResponse> findUserByEmailAndPassword(
            @RequestParam(name = "email") String email,
            @RequestParam(name = "password") String password) {
        final UserResponse userResponse = userService.findUserByEmailAndPassword(email, password);
        if(userResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @ApiOperation(value = "Busca um usuário por id")
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable("id") Long id) {
        UserResponse userResponse = userService.findById(id);
        if(userResponse == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @ApiOperation(value = "Busca um usuário por e-mail")
    @GetMapping("/me")
    public ResponseEntity<UserResponse> findByEmail(@RequestHeader("Authorization") String token) {
        UserResponse userResponse = userService.findByEmail(tokenAuthenticationService.getEmail(token));
        if(userResponse == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
    
}
