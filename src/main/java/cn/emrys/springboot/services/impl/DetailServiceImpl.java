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

    @Override
    public List<Detail> findAll() {
        return null;
    }

    @Override
    public List<Detail> findById(int id) {
        return detailMapper.findById(id);
    }

    @Override
    public void create(Detail detail) {

    }

    @Override
    public void delete(int... ids) {

    }

    @Override
    public void update(Detail detail) {

    }
}
