package com.company.myproject.dao;

import com.company.myproject.entity.Language;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LanguageDaoInter extends CrudRepository<Language,Integer> {
    @Query("SELECT u FROM Language u WHERE u.name = ?1")
    Language findLanguageByName(String name);
}
