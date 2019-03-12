package com.soft1611.meizu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@Builder
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String account;
    @Column(nullable = false)
    private String password;
    private String avatar;
}
