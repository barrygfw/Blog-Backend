package cn.emrys.springboot.mapper;

import cn.emrys.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findByName(String user_name);

    List<User> searchByName(String name);

    int create(User user);

    int update(User user);

    int delete(int id);

    int status(int id, int status);
}
