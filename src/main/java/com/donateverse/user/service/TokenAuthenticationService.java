package com.donateverse.user.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class TokenAuthenticationService {

    private static final String SECRET = "FIAP_69AOJ_MY_SECRETS";

    public String getEmail(final String token) {
        Claims claims = Jwts.parser().setSigningKey(SECRET)
                .parseClaimsJws(token.replace("Bearer ", ""))
                .getBody();
        return claims.getSubject();
    }

}
