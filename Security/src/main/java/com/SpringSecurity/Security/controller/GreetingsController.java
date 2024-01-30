package com.SpringSecurity.Security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
@GetMapping("/hi")
    public ResponseEntity<String>sayHello(){
        return ResponseEntity.ok("Heyyyy dear fucker");
    }

    @GetMapping("/bye")
    public ResponseEntity<String>sayBye(){
        return ResponseEntity.ok("Die fucker, Die");
    }

}
