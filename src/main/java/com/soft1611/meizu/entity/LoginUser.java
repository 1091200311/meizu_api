package com.soft1611.meizu.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUser {
    private String account;
    private String password;
}
