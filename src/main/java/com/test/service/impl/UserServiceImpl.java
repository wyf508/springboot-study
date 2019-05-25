package com.test.service.impl;

import com.test.mapper.UsersMapper;
import com.test.pojo.Users;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/24 0024 下午 2:43
 * @Description TODO
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        System.out.println(usersMapper);
        this.usersMapper.insertUser(users);
    }
}
