package com.company.myproject.dao;

import com.company.myproject.entity.Gender;
import org.springframework.data.repository.CrudRepository;

public interface GenderDaoInter extends CrudRepository<Gender,Integer> {
}
