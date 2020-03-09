package com.company.myproject.dao;

import com.company.myproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDaoInter extends JpaRepository<User,Integer> {
    public User findByEmailAndEnabled(String email, boolean enabled);
    public User findByEmail(String email);
}
