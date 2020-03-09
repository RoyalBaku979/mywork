package com.company.myproject.service.impl;

import com.company.myproject.dao.LanguageDaoInter;
import com.company.myproject.entity.Language;
import com.company.myproject.service.inter.LanguageServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LanguageServiceImpl implements LanguageServiceInter {
    @Autowired
    LanguageDaoInter languageDaoInter;
    @Override
    public Language findById(Integer id) {
        return languageDaoInter.findById(id).get();
    }

    @Override
    public List<Language> findAll() {
        return (List<Language>) languageDaoInter.findAll();
    }

    @Override
    public Language findByName(String name) {
        return languageDaoInter.findLanguageByName(name);
    }


}
