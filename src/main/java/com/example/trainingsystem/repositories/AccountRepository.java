package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    @Query("{ 'Username': ?0 }")
    Optional<Account> findAccountByUsername(String Username);
}
