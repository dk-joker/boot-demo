package org.joker.demo2.dao;

import org.joker.demo2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-06 10:48
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}

