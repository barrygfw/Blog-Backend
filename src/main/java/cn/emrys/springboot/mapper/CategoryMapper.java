package cn.emrys.springboot.mapper;

import cn.emrys.springboot.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAll();

    int create(Category category);

    int update(Category category);

    int delete(int id);
}
