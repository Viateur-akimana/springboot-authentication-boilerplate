package com.rest.apis.service;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {

    public String generateToken(String name) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts.builder()
                .claim()
                .addClaims(claims)
                .setSubject(name)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() * 60 * 60 * 30))
                .and()
                .signWithKey()
                .compact();

    }
}
