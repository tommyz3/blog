package com.tommy.data.dao;

import com.tommy.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: tommy_z
 * @Date: 2019/7/22
 */

@Repository
public interface UserDao extends JpaRepository<User, String> {
    // 查询
    User findByEmail(String email);
    // 删除
    void deleteUserByEmail(String email);
}
