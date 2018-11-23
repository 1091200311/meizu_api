package com.soft1611.meizu.controller;

import com.soft1611.meizu.entity.Location;
import com.soft1611.meizu.service.LocationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin("*")
public class LocationController {
    @Resource
    private LocationService locationService;
    @GetMapping("/all")
    public List<Location> getAll(){
        return locationService.getAll();
    }
}
