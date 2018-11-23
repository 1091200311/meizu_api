package com.soft1611.meizu.service.Impl;

import com.soft1611.meizu.dao.LocationRepository;
import com.soft1611.meizu.entity.Location;
import com.soft1611.meizu.service.LocationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Resource
    private LocationRepository locationRepository;
    @Override
    public List<Location> getAll() {
        return locationRepository.findAll();
    }
}
