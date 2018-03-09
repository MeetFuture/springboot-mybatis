package com.tangqiang.springboot.controller;

import com.tangqiang.springboot.pojo.User;
import com.tangqiang.springboot.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author Tom
 * @version 1.0 2017-11-06 0006 Tom create
 * @date 2017-11-06 0006
 * @copyright Copyright © 2017 Grgbanking All rights reserved.
 */
@RestController
public class IndexController {
    @Autowired
    UserSerivce userSerivce;

    @GetMapping("/index")
    public Map<String, Object> index() {
        Map<String, Object> res = new HashMap<>();
        res.put("a", "This is 11111111111");
        res.put("b", "This is 11111111111");

        return res;
    }

    @GetMapping("/list")
    public List<User> list() {
        return userSerivce.getUser();
    }


}
