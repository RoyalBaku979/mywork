/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.myproject.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author famil
 */
@Entity
@Table(name = "user_language")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserLanguage.findAll", query = "SELECT u FROM UserLanguage u")
    , @NamedQuery(name = "UserLanguage.findById", query = "SELECT u FROM UserLanguage u WHERE u.id = :id")
    , @NamedQuery(name = "UserLanguage.findByLevel", query = "SELECT u FROM UserLanguage u WHERE u.level = :level")})
public class UserLanguage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "level")
    private Integer level;
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language languageId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;

    public UserLanguage() {
    }

    public UserLanguage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Language getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
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
        if (!(object instanceof UserLanguage)) {
            return false;
        }
        UserLanguage other = (UserLanguage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compnay.languagelearnernew.entity.UserLanguage[ id=" + id + " ]";
    }
    
}
