package com.soft1611.meizu.dao;

import com.soft1611.meizu.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository <Phone,Integer> {
}
