package com.jackmaster.springboot1.service.Impl;

import com.jackmaster.springboot1.entity.User;
import com.jackmaster.springboot1.entity.UserTo;
import com.jackmaster.springboot1.mapper.UserMapper;
import com.jackmaster.springboot1.mapper.UserToMapper;
import com.jackmaster.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zxh
 * @Description:
 * @Date: 2019/3/5
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserToMapper userMapper;


    /**
      * @Author:zxh
      * @Description:
      * @Date: 2019/3/5
      */
    @Override
    public List<UserTo> findUserList(String userId) {
        if (userId == null) {
          return   userMapper.findUserList();
        }else {
            ArrayList<UserTo> objects = new ArrayList<>();
            UserTo user = userMapper.selectByPrimaryKey(userId);
            objects.add(user);
            return objects;
        }
    }
}
