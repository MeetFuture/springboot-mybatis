package com.tangqiang.springboot.service;

import com.tangqiang.springboot.dao.UserDao;
import com.tangqiang.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author Tom
 * @version 1.0 2017-11-06 0006 Tom create
 * @date 2017-11-06 0006
 * @copyright Copyright © 2017 Grgbanking All rights reserved.
 */
@Service
public class UserServiceImpl implements UserSerivce {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}
