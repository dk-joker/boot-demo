package org.joker.demo3.service;

import org.joker.demo3.entity.User;
import org.joker.demo3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-07 14:29
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "user-key", key = "''+#name")
    public User getUserByName(String name){
       return userRepository.findByUserName(name);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}

