package com.zebra.giga_dat_back_end.services.impl;

import com.zebra.giga_dat_back_end.models.Demo;
import com.zebra.giga_dat_back_end.repositories.DemoRepository;
import com.zebra.giga_dat_back_end.services.IDemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class DemoService implements IDemoService {

    private final DemoRepository demoRepository;

    @Override
    public List<Demo> getAllDemos() {
        List<Demo> demos = demoRepository.findAll();;
        return demos;
    }
}
