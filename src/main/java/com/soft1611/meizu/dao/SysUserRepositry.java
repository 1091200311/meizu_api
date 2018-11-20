package com.soft1611.meizu.dao;

import com.soft1611.meizu.entity.SysUser;

public interface SysUserRepositry {
    SysUser findSysUserByAccount(String account);
}
