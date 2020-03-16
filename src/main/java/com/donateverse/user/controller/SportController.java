package com.donateverse.user.controller;

import com.donateverse.user.dto.SportResponse;
import com.donateverse.user.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 20/10/2019 22:45
 */
@RestController
@RequestMapping("/sports")
public class SportController {

    final private SportService sportService;

    @Autowired
    public SportController(SportService sportService) {
        this.sportService = sportService;
    }

    @GetMapping
    public ResponseEntity<List<SportResponse>> findAll() {
        final List<SportResponse> sportsResponse = sportService.findAll();
        if(sportsResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(sportsResponse, HttpStatus.OK);
    }
    
}
