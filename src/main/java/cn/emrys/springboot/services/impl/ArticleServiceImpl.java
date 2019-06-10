package cn.emrys.springboot.services.impl;

import cn.emrys.springboot.entity.Article;
import cn.emrys.springboot.mapper.ArticleMapper;
import cn.emrys.springboot.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> findAll() {
        return null;
    }

    @Override
    public List<Article> findById(int id) {
        return null;
    }

    @Override
    public int create(Article article) {
        return 0;
    }

    @Override
    public int delete(int... ids) {
        return 0;
    }

    @Override
    public int update(Article article) {
        return 0;
    }

    @Override
    public List<Article> all(int state, int uid, String keywords, int start, int end) {
        return articleMapper.all(state, uid, keywords, start, end);
    }

    @Override
    public int allCount(int state, int uid, String keywords) {
        return articleMapper.allCount(state, uid, keywords);
    }
}
