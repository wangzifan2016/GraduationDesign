package com.hebnu.cs.gd.service;

import com.hebnu.cs.gd.model.dto.LoginInfo;
import com.hebnu.cs.gd.model.dto.PageInfo;
import com.hebnu.cs.gd.model.entity.SysUser;

import java.io.Serializable;


public interface SysUserService {

    long insertUser(SysUser user, String jobIds, String permissionIds);

    boolean isExistLoginName(String loginName);

    void deleteById(long id);

    SysUser selectById(long id);

    boolean isExistLoginNameExcludeId(long id, String loginName);

    void updateUser(SysUser user, String jobIds, String permissionIds);

    PageInfo selectPage(int page, int rows, String sort, String order, String loginName, String zhName, String email, String phone, String address);

    void updateUser(SysUser user);

    SysUser selectByLoginName(String loginName);

    LoginInfo login(SysUser user, Serializable id, int platform);


}
