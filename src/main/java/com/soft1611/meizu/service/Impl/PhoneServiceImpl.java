package com.soft1611.meizu.service.Impl;

import com.soft1611.meizu.dao.PhoneRepository;
import com.soft1611.meizu.entity.Phone;
import com.soft1611.meizu.service.PhoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {
    @Resource
    private PhoneRepository phoneRepository;

    @Override
    public List<Phone> getAll() {
        return phoneRepository.findAll();
    }

    public List<Phone> getPhonesByNameLike(String keywords) {
        return phoneRepository.findByName(keywords);
    }

}
