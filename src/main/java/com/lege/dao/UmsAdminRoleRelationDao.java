package com.lege.dao;

import com.lege.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lege
 * @Description 后台用户与角色管理自定义Dao
 * @create 2022-06-14 14:35
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
