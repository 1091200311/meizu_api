package com.soft1611.meizu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Location {
    @Id
    @GeneratedValue
    private Integer id;
    private String UserName;
    private String UserAddress;
    private String UserTelephone;

}
