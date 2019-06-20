package com.soft.jdbctemplate;

import com.soft.bean.User;

import java.util.List;

public interface UserDao {

    //增
    public void save(User u);
    //删
    public void delete(Integer id);
    //改
    public void update(User u);
    //查
    public User getById(Integer id);
    //查
    public int getTotalCount();
    //查
    public List<User> getAll();

}
