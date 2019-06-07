package cn.emrys.springboot.services;

import cn.emrys.springboot.entity.User;

public interface UserService extends BaseService<User>{
    User findByName(String user_name);
}