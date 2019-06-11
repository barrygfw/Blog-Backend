package cn.emrys.springboot.services;

import cn.emrys.springboot.entity.Article;

import java.util.List;

public interface ArticleService extends BaseService<Article> {
    List<Article> all(int state, int uid, String keywords, int start, int end);
    int allCount(int state, int uid, String keywords);
    int recycle(int... ids);
}
