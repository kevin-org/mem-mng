package com.kevin.mem.mng.service.impl;


import com.kevin.mem.mng.domain.mapper.ModuleMapper;
import com.kevin.mem.mng.service.ModuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleMapper moduleMapper;
}
