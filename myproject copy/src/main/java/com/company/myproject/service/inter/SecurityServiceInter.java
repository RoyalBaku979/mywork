package com.company.myproject.service.inter;

import com.company.myproject.bean.CustomUserDetail;

public interface SecurityServiceInter {
    CustomUserDetail getLoggedInUserDetails();

    void reloadRoles();
}

