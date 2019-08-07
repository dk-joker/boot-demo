package org.joker.demo2;

import org.joker.demo2.dao.UserRepository;
import org.joker.demo2.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-06 10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
//        User user1 = userRepository.findByUserName("tom");
//        System.out.println(user1.getId()+ "\n" + user1.getUserName() + "\n" + user1.getNickName());
//        Assert.assertEquals("tonny",user1.getNickName());
        userRepository.save(new User("aa1", "aa1@126.com", "aa", "aa1123456", formattedDate));
        userRepository.save(new User("bb1", "bb1@126.com", "bb", "bb1123456", formattedDate));
        userRepository.save(new User("cc1", "cc1@126.com", "cc", "cc1123456", formattedDate));

        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc1@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));
    }

}

