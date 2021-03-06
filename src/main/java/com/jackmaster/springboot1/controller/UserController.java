package com.jackmaster.springboot1.controller;

import com.jackmaster.springboot1.entity.UserTo;
import com.jackmaster.springboot1.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:zxh
 * @Description:
 * @Date: 2019/3/5
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService  userService;

    @RequestMapping(value = "/findUserList",method = RequestMethod.GET)
    public List<UserTo> findUserList(String userId){
        return userService.findUserList(userId);
    }

}
