package com.soft1611.meizu.controller;

import com.soft1611.meizu.entity.LoginUser;
import com.soft1611.meizu.service.Impl.SysUserService;
import com.soft1611.meizu.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:80")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        System.out.println(loginUser);
        return sysUserService.userLogin(loginUser);
    }
}
