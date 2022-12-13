package com.example.trainingsystem.services;

import com.example.trainingsystem.models.Account;
import com.example.trainingsystem.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private AccountRepository accountRepository;

    public String login(Account account){
        Optional<Account> _account = accountRepository.findAccountByUsername(account.getUsername());
        if(_account.isPresent()){
            if(_account.get().getPassword().equals(account.getPassword()))
                account.setRole(_account.get().getRole());
            else
                return "Wrong password!";
        }
        else
            return "Username Not Found!";

        return "Login successfully with role: " + account.getRole();
    }
}
