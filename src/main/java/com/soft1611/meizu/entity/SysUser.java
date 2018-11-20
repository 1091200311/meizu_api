package com.soft1611.meizu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class SysUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String password;
    private String avatar;
    private String sex;
    private String company;
}