package com.nitishdash.IAM_Backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestrictedInfoController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String uid = authentication.getName(); // This gives you the 'sub' from the token
        String body = "Hello " + uid + " and welcome to the super secret page!";
        return ResponseEntity.ok(body);
    }
}
