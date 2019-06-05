package cn.emrys.springboot.services;

import java.util.List;

public interface BaseService<T> {
    //查询所有
    List<T> findAll();

    //根据id查询
    List<T> findById(int id);

    //添加
    void create(T t);

    //删除(批量)
    void delete(int... ids);

    //修改
    void update(T t);
}