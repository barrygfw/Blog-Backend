package cn.emrys.springboot.mapper;

import cn.emrys.springboot.entity.Detail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailMapper {
    List<Detail> findById(int id);

    List<Detail> findAll();
}
