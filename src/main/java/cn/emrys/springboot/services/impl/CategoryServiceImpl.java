package cn.emrys.springboot.services.impl;

import cn.emrys.springboot.entity.Category;
import cn.emrys.springboot.mapper.CategoryMapper;
import cn.emrys.springboot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public int create(Category category) {
        category.setDate((int) (System.currentTimeMillis() / 1000));
        return categoryMapper.create(category);
    }

    @Override
    public int delete(int... ids) {
        int num = 0;
        for(int id : ids) {
            num += categoryMapper.delete(id);
        }
        return num;
    }

    @Override
    public int update(Category category) {
        category.setDate((int) (System.currentTimeMillis() / 1000));
        return categoryMapper.update(category);
    }
}
