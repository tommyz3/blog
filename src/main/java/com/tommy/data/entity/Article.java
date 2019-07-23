package com.tommy.data.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: tommy_z
 * @Date: 2019/7/23
 */

@Data
@Entity
@Table(name = "article")
public class Article {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "TIME")
    private String time;
    @Column(name = "VIEW_COUNT")
    private int viewCount;
    @Column(name = "TYPE")
    private String type;
}
