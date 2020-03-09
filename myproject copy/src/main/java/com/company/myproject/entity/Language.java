/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.myproject.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author famil
 */
@Entity
@Table(name = "language")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Language.findAll", query = "SELECT l FROM Language l")
    , @NamedQuery(name = "Language.findById", query = "SELECT l FROM Language l WHERE l.id = :id")
    , @NamedQuery(name = "Language.findByName", query = "SELECT l FROM Language l WHERE l.name = :name")
    , @NamedQuery(name = "Language.findByInsertDateTime", query = "SELECT l FROM Language l WHERE l.insertDateTime = :insertDateTime")
    , @NamedQuery(name = "Language.findByLastUpdateDateTime", query = "SELECT l FROM Language l WHERE l.lastUpdateDateTime = :lastUpdateDateTime")
    , @NamedQuery(name = "Language.findByInsertUserId", query = "SELECT l FROM Language l WHERE l.insertUserId = :insertUserId")})
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insert_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertDateTime;
    @Column(name = "last_update_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDateTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insert_user_id")
    private int insertUserId;
    @OneToMany(mappedBy = "translationLangId", fetch = FetchType.LAZY)
    private List<Wordlist> wordlistList;
    @OneToMany(mappedBy = "wordLangId", fetch = FetchType.LAZY)
    private List<Wordlist> wordlistList1;
    @OneToMany(mappedBy = "languageId", fetch = FetchType.LAZY)
    private List<UserLanguage> userLanguageList;

    public Language() {
    }

    public Language(Integer id) {
        this.id = id;
    }

    public Language(Integer id, String name, Date insertDateTime, int insertUserId) {
        this.id = id;
        this.name = name;
        this.insertDateTime = insertDateTime;
        this.insertUserId = insertUserId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInsertDateTime() {
        return insertDateTime;
    }

    public void setInsertDateTime(Date insertDateTime) {
        this.insertDateTime = insertDateTime;
    }

    public Date getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public int getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(int insertUserId) {
        this.insertUserId = insertUserId;
    }

    @XmlTransient
    public List<Wordlist> getWordlistList() {
        return wordlistList;
    }

    public void setWordlistList(List<Wordlist> wordlistList) {
        this.wordlistList = wordlistList;
    }

    @XmlTransient
    public List<Wordlist> getWordlistList1() {
        return wordlistList1;
    }

    public void setWordlistList1(List<Wordlist> wordlistList1) {
        this.wordlistList1 = wordlistList1;
    }

    @XmlTransient
    public List<UserLanguage> getUserLanguageList() {
        return userLanguageList;
    }

    public void setUserLanguageList(List<UserLanguage> userLanguageList) {
        this.userLanguageList = userLanguageList;
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
        if (!(object instanceof Language)) {
            return false;
        }
        Language other = (Language) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compnay.languagelearnernew.entity.Language[ id=" + id + " ]";
    }
    
}
