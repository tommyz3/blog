package com.tommy.service;

import com.tommy.data.entity.User;

/**
 * @Author: tommy_z
 * @Date: 2019/7/22
 */
public interface UserService {
    // 登录验证
    boolean login(User user);
    // 删除用户
    void delete(User user);
}
