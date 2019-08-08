package org.joker.demo5.controller;

import org.joker.demo5.entity.User;
import org.joker.demo5.mapper.test1.User1Mapper;
import org.joker.demo5.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-08 12:53
 */
@RestController
public class UserController {
    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        return user2Mapper.getAll();
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id")Long id) {
        return user2Mapper.getOne(id);
    }

    @RequestMapping("/add")
    public void save(User user) {
        user1Mapper.insert(user);
    }

    @RequestMapping(value = "update")
    public void update(User user) {
        user1Mapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }

}

