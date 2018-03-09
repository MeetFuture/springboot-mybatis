package com.tangqiang.springboot.dao;

import com.tangqiang.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * TODO
 *
 * @author Tom
 * @version 1.0 2017-11-06 0006 Tom create
 * @date 2017-11-06 0006
 * @copyright Copyright © 2017 Grgbanking All rights reserved.
 */
@Mapper
public interface UserDao {

    @Select("select * from User")
    public List<User> getUser();

}
