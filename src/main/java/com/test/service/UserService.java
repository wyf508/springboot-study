package com.test.service;

import com.test.pojo.Users;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/24 0024 下午 2:41
 * @Description TODO
 */
public interface UserService {
    void addUser(Users users);

    Users getUser(int id);
}
