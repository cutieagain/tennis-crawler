package com.cutie.service;

import com.cutie.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by cutie on 2018/5/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.cutie.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void t1(){
       List<User> users = userService.findAllUser(1,20);
       System.out.println(users);
    }
}
