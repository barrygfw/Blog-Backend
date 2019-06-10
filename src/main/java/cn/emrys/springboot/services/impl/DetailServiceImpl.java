package cn.emrys.springboot.services.impl;

import cn.emrys.springboot.entity.Detail;
import cn.emrys.springboot.mapper.DetailMapper;
import cn.emrys.springboot.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    DetailMapper detailMapper;

    /**
     * 查询所有的文章详情
     * @return
     */
    @Override
    public List<Detail> findAll() {
        return detailMapper.findAll();
    }

    /**
     * 根据id查询单个文章的详情
     * @param id
     * @return
     */
    @Override
    public Detail findById(int id) {
        return detailMapper.findById(id);
    }

    @Override
    public int create(Detail detail) {
        return 0;
    }

    @Override
    public int delete(int... ids) {
        return 0;
    }

    @Override
    public int update(Detail detail) {
        return 0;
    }
}
