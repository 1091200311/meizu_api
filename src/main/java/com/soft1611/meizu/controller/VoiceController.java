package com.soft1611.meizu.controller;

import com.soft1611.meizu.entity.Voice;
import com.soft1611.meizu.service.VoiceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/voice")
@CrossOrigin("http:localhost:80")
public class VoiceController {
    @Resource
    private VoiceService voiceService;
    @GetMapping("/all")
    public List<Voice> getAll(){
        return voiceService.getAll();
    }
}
