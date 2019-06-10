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
    public User findById(int id) {
        return null;
    }

    @Override
    public int create(User user) {
        return userMapper.create(user);
    }

    @Override
    public int delete(int... ids) {
        int num = 0;
        for (int id : ids) {
            num += userMapper.delete(id);
        }
        return num;
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public User findByName(String user_name) {
        return userMapper.findByName(user_name);
    }

    @Override
    public List<User> searchByName(String name) {
        return userMapper.searchByName(name);
    }

    @Override
    public int update_status(int id, int status) {
        return userMapper.status(id, status);
    }
}