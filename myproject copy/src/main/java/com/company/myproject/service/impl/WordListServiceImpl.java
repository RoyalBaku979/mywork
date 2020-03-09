package com.company.myproject.service.impl;

import com.company.myproject.dao.WordListDaoInter;
import com.company.myproject.entity.Wordlist;
import com.company.myproject.service.inter.WordListServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WordListServiceImpl implements WordListServiceInter {
    @Autowired
    WordListDaoInter wordListDaoInter;

    @Override
    public Wordlist findById(Integer id) {
        return wordListDaoInter.findById(id).get();
    }

    @Override
    public List<Wordlist> findAll() {

        return (List<Wordlist>) wordListDaoInter.findAll();
    }

    @Override
    public List<Wordlist> findByTraslation(String word) {
        return null;
    }

    @Override
    public int save(Wordlist word) {

        return wordListDaoInter.save(word).getId();
    }

    @Override
    public Wordlist update(Wordlist word) {
        Wordlist wordlist=wordListDaoInter.findById(word.getId()).get();
        wordlist.setImportDate(word.getImportDate());
        wordlist.setRightCount(word.getRightCount());
        wordlist.setImportUserId(word.getImportUserId());
        wordlist.setTranslation(word.getTranslation());
        wordlist.setTranslationLangId(word.getTranslationLangId());
        wordlist.setWord(word.getWord());
        wordlist.setWordLangId(word.getWordLangId());
        wordlist.setWrongCount(word.getWrongCount());
        wordListDaoInter.save(wordlist);
        return wordlist;
    }
}
