package com.company.myproject.service.impl;

import com.company.myproject.dao.GenderDaoInter;
import com.company.myproject.entity.Gender;
import com.company.myproject.service.inter.GenderServiseInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenderServiceImpl implements GenderServiseInter {
    @Autowired
    GenderDaoInter genderDaoInter;
    @Override
    public Gender findById(Integer id) {
        return genderDaoInter.findById(id).get();
    }

    @Override
    public List<Gender> findAll() {
        return (List<Gender>) genderDaoInter.findAll();
    }

    @Override
    public Gender save(Gender gender) {
        return genderDaoInter.save(gender);
    }
}
