package com.soft1611.meizu.dao;

import com.soft1611.meizu.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    SysUser findSysUserByAccount(String account);
}
