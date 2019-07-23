package com.tommy.service.impl;

import com.tommy.data.dao.UserDao;
import com.tommy.data.entity.User;
import com.tommy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: tommy_z
 * @Date: 2019/7/22
 */
@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserDao userDao;

    @Override
    public boolean login(User user) {
        User u = userDao.findByEmail(user.getEmail());
        logger.info(u.toString() + "请求登录");
        return user.getPassword().equals(u.getPassword());
    }


    @Override
    public void delete(User user) {
        userDao.deleteUserByEmail(user.getEmail());
    }
}
