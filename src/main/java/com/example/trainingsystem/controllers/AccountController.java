package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.Account;
import com.example.trainingsystem.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
//@Controller
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    /*
    //URL: localhost:8080/api/login
    @GetMapping("api/login")
    public String showLoginForm(Model model){
        model.addAttribute("Account", new Account());
        return "login";
    }

    //URL: localhost:8080/api/logged
    @PostMapping("api/logged")
    public String formAuthentication(@ModelAttribute Account acc, Model model){

        //Authentication tasks here:
        //Get account from DB & Check

        model.addAttribute("Username", acc.getUsername());
        return "logged";
    }*/

    /*@PostMapping("/login")
    public Account inputAccount(@RequestBody Account account){
        return account;
    }

    @GetMapping("/login")
    public Account getInputAccount(@RequestBody Account account){
        account.toString();
        return account;
    }*/
}
