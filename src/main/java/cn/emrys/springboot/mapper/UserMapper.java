package cn.emrys.springboot.mapper;

import cn.emrys.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findByName(String user_name);

    void create(User user);

    void update(User user);
}
