package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.Account;
import com.example.trainingsystem.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
    @Autowired
    private AuthService authService;

    //Login
    @PostMapping("/auth/signin")
    public String login(@RequestBody Account account){
        return authService.login(account);
    }

//    @PostMapping("/auth/signout")

    // Phân quyền truy cập tài nguyên theo admin, trainee, trainer, upperManager
//    @GetMapping("/test/admin")
//
//    @GetMapping("/test/trainee")
//
//    @GetMapping("/test/trainer")
//
//    @GetMapping("/test/upperManager")

}
