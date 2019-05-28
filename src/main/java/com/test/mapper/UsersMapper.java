package com.test.mapper;

import com.test.pojo.Users;
import org.apache.ibatis.annotations.Select;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/23 0023 下午 10:29
 * @Description TODO
 */
public interface UsersMapper {

    void insertUser(Users users);

    @Select("select * from users where id = #{id}")
    Users getUser(int id);
}
