package com.company.myproject.service.inter;

 import com.company.myproject.entity.Wordlist;

import java.util.List;

public interface WordListServiceInter
{
    public Wordlist findById(Integer id);
    public List<Wordlist> findAll();
    public List<Wordlist>findByTraslation(String word);
    public int save(Wordlist word);
    public Wordlist update(Wordlist word);



}
