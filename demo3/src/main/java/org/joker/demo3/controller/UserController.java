package org.joker.demo3.controller;

import org.joker.demo3.entity.User;
import org.joker.demo3.repository.UserRepository;
import org.joker.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-07 13:21
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping(value = "/getUser/{userName}",method = RequestMethod.GET)
    public User getUser(@PathVariable("userName") String username) {
        return userService.getUserByName(username);
    }

    @RequestMapping(value = "/addUser/{userName}/{passWord}",method = RequestMethod.GET)
    public String addUser(@PathVariable("userName") String userName,
                          @PathVariable("passWord") String passWord) {
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        userService.addUser(user);
        return "success";
    }
}

