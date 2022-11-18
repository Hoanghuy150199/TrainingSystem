package com.example.trainingsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {
    private String Id;
    private String Username;
    private String Password;
    private String Role;
}
