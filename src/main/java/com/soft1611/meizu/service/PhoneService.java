package com.soft1611.meizu.service;

import com.soft1611.meizu.entity.Phone;

import java.util.List;

public interface PhoneService {
    List<Phone> getAll();
    List<Phone> getPhonesByNameLike(String keywords);
}
