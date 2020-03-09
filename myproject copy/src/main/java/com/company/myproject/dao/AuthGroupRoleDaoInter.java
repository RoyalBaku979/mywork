package com.company.myproject.dao;


import com.company.myproject.entity.AuthGroup;
import com.company.myproject.entity.AuthGroupRole;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AuthGroupRoleDaoInter extends CrudRepository<AuthGroupRole,Integer> {
    List<AuthGroupRole>findByGroupId(AuthGroup group);
}
