package com.dhir.atsecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SIGNUP_TBL")

public class SignUp {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String password;
}
