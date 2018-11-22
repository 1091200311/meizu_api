package com.soft1611.meizu.dao;

import com.soft1611.meizu.entity.Phone;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneRepositoryTest {
    @Resource
    private PhoneRepository phoneRepository;
    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void findByNameLike() {
        List<Phone> phone= phoneRepository.findByName("魅族16th");
        phone.forEach(phone1 -> System.out.println(phone));
    }
}