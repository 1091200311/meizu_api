package com.soft1611.meizu.service.Impl;


import com.soft1611.meizu.entity.LoginUser;
import com.soft1611.meizu.utils.ResponseUtil;
import org.springframework.stereotype.Service;

@Service
public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);
}
