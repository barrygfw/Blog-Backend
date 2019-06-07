package cn.emrys.springboot.services.impl;

import cn.emrys.springboot.entity.User;
import cn.emrys.springboot.mapper.UserMapper;
import cn.emrys.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findById(int id) {
        return null;
    }

    @Override
    public void create(User user) {
        userMapper.create(user);
    }

    @Override
    public void delete(int... ids) {

    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    public User findByName(String user_name) {
        return userMapper.findByName(user_name);
    }
}
