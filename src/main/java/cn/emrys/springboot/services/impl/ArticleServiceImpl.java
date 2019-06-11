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
    public Article findById(int id) {
        return articleMapper.findById(id);
    }

    @Override
    public int create(Article article) {
        article.setPublishDate((int)(System.currentTimeMillis() / 1000));
        article.setEditTime((int)(System.currentTimeMillis() / 1000));
        return articleMapper.create(article);
    }

    @Override
    public int delete(int... ids) {
        int num = 0;
        for (int id : ids) {
            num += articleMapper.delete(id);
        }
        return num;
    }

    @Override
    public int update(Article article) {
        article.setEditTime((int) (System.currentTimeMillis() / 1000));
        return articleMapper.update(article);
    }

    @Override
    public List<Article> all(int state, int uid, String keywords, int start, int end) {
        return articleMapper.all(state, uid, keywords, start, end);
    }

    @Override
    public int allCount(int state, int uid, String keywords) {
        return articleMapper.allCount(state, uid, keywords);
    }

    @Override
    public int recycle(int... ids) {
        int num = 0;
        for (int id : ids) {
            num += articleMapper.recycle(id);
        }
        return num;
    }
}
