package com.soft1611.meizu.controller;

import com.soft1611.meizu.entity.Phone;
import com.soft1611.meizu.service.PhoneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/phone")
@CrossOrigin("*")
public class PhoneController {
    @Resource
    private PhoneService phoneService;
    @GetMapping("/all")
    public List<Phone> getAll(){
        return phoneService.getAll();
    }
    @GetMapping("/name")
    public List<Phone> getPhoneByNameLike(@RequestParam String keywords) {
        return (List<Phone>) phoneService.getPhonesByNameLike(keywords);
    }

}
