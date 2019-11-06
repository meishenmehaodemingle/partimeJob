package com.vip.items.mapper;

import com.vip.items.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author song
 */
public interface UserMapper {
    User findDetail(@Param("uid") int uid);
    /**
     * 根据用户名查找其是否存在
     * @param username
     * @return
     */
    User findByUsername(@Param("username") String username);

    int insertUser(@Param("username") String username, @Param("password") String password,
                   @Param("email") String email, @Param("utel") String utel);

    User userById(@Param("uid")int uid);

    int updatePassword(@Param("username") String username,@Param("password") String password,
                       @Param("newPassword") String newPassword);
}
