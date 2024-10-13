package com.dhir.atsecom.controller;

import com.dhir.atsecom.entity.SignUp;
import com.dhir.atsecom.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signUp")
    public SignUp signUp(@RequestBody SignUp signUp) {
        return signUpService.saveSignUp(signUp);
    }

    @GetMapping("/signUp")
    public List<SignUp> getSignUp() {
        return signUpService.getAllSignUp();
    }
}
