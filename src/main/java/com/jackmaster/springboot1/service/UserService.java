package com.jackmaster.springboot1.service;

import com.jackmaster.springboot1.entity.User;
import com.jackmaster.springboot1.entity.UserTo;

import java.util.List;

public interface UserService {

    /**
      * @Author:zxh
      * @Description:
      * @Date: 2019/3/5
      */
    public List<UserTo> findUserList(String userId);

}
