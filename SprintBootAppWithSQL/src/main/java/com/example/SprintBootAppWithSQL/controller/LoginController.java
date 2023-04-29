package com.example.SprintBootAppWithSQL.controller;

import com.example.SprintBootAppWithSQL.dto.JwtDto;
import com.example.SprintBootAppWithSQL.dto.UserDto;
import com.example.SprintBootAppWithSQL.entities.User;
import com.example.SprintBootAppWithSQL.services.UserService;
import com.example.SprintBootAppWithSQL.services.jwt.jwtImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    jwtImpl jwt;

    @Autowired
    UserService userService;



    @PostMapping("/api/v1/login/")
    public ResponseEntity<JwtDto> login(@RequestBody UserDto user) {
        try {

            System.out.println("User - " + user);
            UserDto   result =  userService.getUserByUserName(user);
            //userRepository.save(user);
            return new ResponseEntity<>(jwt.createToken(), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
