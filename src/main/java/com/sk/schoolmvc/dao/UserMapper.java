package com.sk.schoolmvc.dao;

import com.sk.schoolmvc.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author qiaochx
 */
@Repository
public interface UserMapper {
    /**
     * 查询用户
     *
     * @param user 用户信息
     * @return user
     */
    User findUser(User user);
}
