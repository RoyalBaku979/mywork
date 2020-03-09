/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.myproject.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author famil
 */
@Entity
@Table(name = "wordlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wordlist.findAll", query = "SELECT w FROM Wordlist w")
    , @NamedQuery(name = "Wordlist.findById", query = "SELECT w FROM Wordlist w WHERE w.id = :id")
    , @NamedQuery(name = "Wordlist.findByImportDate", query = "SELECT w FROM Wordlist w WHERE w.importDate = :importDate")
    , @NamedQuery(name = "Wordlist.findByTranslation", query = "SELECT w FROM Wordlist w WHERE w.translation = :translation")
    , @NamedQuery(name = "Wordlist.findByWord", query = "SELECT w FROM Wordlist w WHERE w.word = :word")})
public class Wordlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "import_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date importDate;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "right_count")
    private String rightCount;
    @Size(max = 255)
    @Column(name = "translation")
    private String translation;
    @Size(max = 255)
    @Column(name = "word")
    private String word;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "wrong_count")
    private String wrongCount;
    @JoinColumn(name = "import_user_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User importUserId;
    @JoinColumn(name = "translation_lang_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language translationLangId;
    @JoinColumn(name = "word_lang_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language wordLangId;

    public Wordlist() {
    }

    public Wordlist(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getRightCount() {
        return rightCount;
    }

    public void setRightCount(String rightCount) {
        this.rightCount = rightCount;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWrongCount() {
        return wrongCount;
    }

    public void setWrongCount(String wrongCount) {
        this.wrongCount = wrongCount;
    }

    public User getImportUserId() {
        return importUserId;
    }

    public void setImportUserId(User importUserId) {
        this.importUserId = importUserId;
    }

    public Language getTranslationLangId() {
        return translationLangId;
    }

    public void setTranslationLangId(Language translationLangId) {
        this.translationLangId = translationLangId;
    }

    public Language getWordLangId() {
        return wordLangId;
    }

    public void setWordLangId(Language wordLangId) {
        this.wordLangId = wordLangId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wordlist)) {
            return false;
        }
        Wordlist other = (Wordlist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compnay.languagelearnernew.entity.Wordlist[ id=" + id + " ]";
    }
    
}
