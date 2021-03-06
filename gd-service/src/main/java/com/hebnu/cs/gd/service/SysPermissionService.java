package com.hebnu.cs.gd.service;


import com.hebnu.cs.gd.model.dto.PageInfo;
import com.hebnu.cs.gd.model.entity.SysPermission;
import com.hebnu.cs.gd.model.entity.SysPermissionGroup;

import java.util.List;


public interface SysPermissionService {
    boolean isExistName(long groupId, String name);

    boolean isExistCode(long groupId, String code);

    long insertPermission(SysPermission sysPermission);

    SysPermission selectById(long id);

    void update(SysPermission sysPermission);

    boolean isExistNameExcludeId(long id, long groupId, String name);

    boolean isExistCodeExcludeId(long id, long groupId, String code);

    PageInfo selectPage(int page, int rows);

    boolean isExistGroupName(String name);

    long insertPermissionGroup(SysPermissionGroup sysPermissionGroup);

    List<SysPermissionGroup> selectGroup();
}
