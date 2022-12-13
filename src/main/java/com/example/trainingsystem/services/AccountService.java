package com.example.trainingsystem.services;

import com.example.trainingsystem.models.Account;
import com.example.trainingsystem.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public ResponseEntity<Account> getAccountById(String Id){
        Optional<Account> account = accountRepository.findById(Id);
        if(account.isPresent()){
            return new ResponseEntity<>(account.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Account> addAccount(Account account){
        try{
            Account _account = accountRepository.save(account);
            return new ResponseEntity<>(_account, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Account> updateAccount(String traineeId, Account account){
        Optional<Account> accountData = accountRepository.findById(traineeId);
        if(accountData.isPresent()){
            account.set_id(traineeId);
            return new ResponseEntity<>(accountRepository.save(account), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String removeAccountById(String Id){
        Optional<Account> account = accountRepository.findById(Id);
        if(account.isPresent()){
            accountRepository.delete(account.get());
            return "Deleted successfully";
        }
        else{
            return "NOT FOUND";
        }
    }
}
