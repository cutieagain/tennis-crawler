package com.cutie.service;

import com.cutie.entity.User;

import java.util.List;

/**
 * Created by cutie on 2018/5/7.
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
