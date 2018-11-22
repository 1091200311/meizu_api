package com.soft1611.meizu.service.Impl;
import com.soft1611.meizu.dao.SysUserRepository;
import com.soft1611.meizu.entity.LoginUser;
import com.soft1611.meizu.entity.SysUser;
import com.soft1611.meizu.service.SysUserService;
import com.soft1611.meizu.utils.ResponseUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepository;
    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepository.findSysUserByAccount(loginUser.getAccount());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "登陆成功", sysUser);
            } else {
                return new ResponseUtil(0, "密码错误");
            }
        } else {
            return new ResponseUtil(0, "账号错误");
        }
    }
}
