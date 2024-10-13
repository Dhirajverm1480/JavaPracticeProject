package com.dhir.atsecom.service;

import com.dhir.atsecom.entity.SignUp;
import com.dhir.atsecom.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SignUpService {
    @Autowired
    private SignUpRepository signUpRepository;
    public SignUp saveSignUp(SignUp signUp) {
        return signUpRepository.save(signUp);
    }

    public List<SignUp> getAllSignUp() {
        return signUpRepository.findAll();
    }
}
