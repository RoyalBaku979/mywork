package com.company.myproject.service.inter;

import com.company.myproject.entity.User;

import java.util.List;

public interface UserServiceInter {

    public User findById(Integer id);

    public List<User> findAll();

    public User findByEmail(String email);

    public int save(User user);

    public User update( com.company.myproject.bean.User user);
}
