package com.hebnu.cs.gd.service;



import com.hebnu.cs.gd.model.dto.PageInfo;
import com.hebnu.cs.gd.model.dto.SysOrganizationTree;
import com.hebnu.cs.gd.model.entity.SysOrganization;

import java.util.List;


public interface SysOrganizationService {
    Long insertOrganization(SysOrganization sysOrganization);

    int deleteOrganization(long id);

    void updateOrganization(SysOrganization organization);

    PageInfo selectPage(int page, int row, long id);

    public SysOrganizationTree selectSysOrganizationTree(long id);

    public List<SysOrganizationTree> selectChildrenTreeList(long id);

    boolean isExistFullName(String fullName);

    SysOrganization selectOrganization(long id);

    boolean isExistFullNameExcludeId(long id, String fullName);

}
