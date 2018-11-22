package com.soft1611.meizu.service.Impl;

import com.soft1611.meizu.dao.VoiceRepository;
import com.soft1611.meizu.entity.Voice;
import com.soft1611.meizu.service.VoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VoiceServiceImpl implements VoiceService {
    @Resource
    private VoiceRepository voiceRepository;

    @Override
    public List<Voice> getAll() {
        return voiceRepository.findAll();
    }
}
