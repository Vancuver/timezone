package com.timezone.core.controller;

import com.timezone.core.model.User;
import com.timezone.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller1 {

    private final UserService userService;

    @GetMapping("/firstpage/{id}")
    public User sayHello(@PathVariable Long id){
        return userService.getUser(id);
    }
}
