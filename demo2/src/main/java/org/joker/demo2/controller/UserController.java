package org.joker.demo2.controller;

import org.joker.demo2.dao.UserRepository;
import org.joker.demo2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-06 10:05
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user")
    public List<User> getUser() {
        return userRepository.findAll();
    }
}

