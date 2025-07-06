package com.devtkms.awsec2rdsspringbootdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
