package com.tommy.data.dao;

import com.tommy.data.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ArticleDao extends JpaRepository<Article, Integer> {
    public Article findById(int id);
    public Article findByTime(String time);
    public Article findByType(String type);
    @Transactional
    public List<Article> findAll();
}
