package cn.emrys.springboot.services;

import cn.emrys.springboot.entity.User;

import java.util.List;

public interface UserService extends BaseService<User>{
    User findByName(String user_name);

    List<User> searchByName(String name);

    int update_status(int id, int status);
}