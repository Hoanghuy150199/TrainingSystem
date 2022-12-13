package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
//    public Account findBy_id(Object id);
}
