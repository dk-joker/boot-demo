package org.joker.demo5.mapper.test2;

import org.apache.ibatis.annotations.*;
import org.joker.demo5.entity.User;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-08 10:57
 */
public interface User2Mapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);

    @Insert("INSERT INTO user(userName,passWord) VALUES(#{userName}, #{passWord})")
    void insert(User user);

    @Update("UPDATE user SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
}

