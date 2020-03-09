package com.company.myproject.dao;

import com.company.myproject.entity.Wordlist;
import org.springframework.data.repository.CrudRepository;

public interface WordListDaoInter extends CrudRepository<Wordlist,Integer> {
}
