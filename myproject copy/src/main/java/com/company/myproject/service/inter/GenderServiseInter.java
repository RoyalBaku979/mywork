package com.company.myproject.service.inter;

import com.company.myproject.entity.Gender;

import java.util.List;

public interface GenderServiseInter {
    public Gender findById(Integer id);

    public List<Gender> findAll();

    public Gender save(Gender gender);
}
