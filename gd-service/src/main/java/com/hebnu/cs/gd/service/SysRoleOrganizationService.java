package com.hebnu.cs.gd.service;


import com.hebnu.cs.gd.model.dto.PageInfo;
import com.hebnu.cs.gd.model.dto.SysRoleOrganizationTree;
import com.hebnu.cs.gd.model.entity.SysRoleOrganization;

import java.util.List;


public interface SysRoleOrganizationService {
    boolean isExistName(String name, long parentId);

    long insertRoleOrganization(SysRoleOrganization roleOrganization);

    boolean isExistNameExcludeId(long id, String name, long parentId);

    void updateRoleOrganization(SysRoleOrganization roleOrganization);

    SysRoleOrganization selectRoleOrganizationById(long id);

    PageInfo selectPage(int page, int rows, long id);

    public SysRoleOrganizationTree selectSysRoleOrganizationTree(long id);

    public List<SysRoleOrganizationTree> selectSysRoleOrganizationTreeChildrenList(long id);
}
