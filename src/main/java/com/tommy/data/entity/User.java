package com.tommy.data.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author: tommy_z
 * @Date: 2019/7/22
 */

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USERNAME")
    private String username;
}
