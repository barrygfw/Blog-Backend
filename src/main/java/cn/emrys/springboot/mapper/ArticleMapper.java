package cn.emrys.springboot.mapper;

import cn.emrys.springboot.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> all(int state, int uid, String keywords, int start, int end);

    int allCount(int state, int uid, String keywords);
}
