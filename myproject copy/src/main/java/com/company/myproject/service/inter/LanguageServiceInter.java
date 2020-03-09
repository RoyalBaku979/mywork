package com.company.myproject.service.inter;

import com.company.myproject.entity.Language;

import java.util.List;

public interface LanguageServiceInter {
    public Language findById(Integer id);

    public List<Language> findAll();


    Language findByName(String name);
}
