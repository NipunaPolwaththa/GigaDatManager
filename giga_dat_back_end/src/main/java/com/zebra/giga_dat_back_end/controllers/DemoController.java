package com.zebra.giga_dat_back_end.controllers;

import com.zebra.giga_dat_back_end.services.IDemoService;
import com.zebra.giga_dat_back_end.swagger.SecureSwagger;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
public class DemoController {

    private final IDemoService iDemoService;

    @GetMapping("/all")
    @SecureSwagger
    public ResponseEntity<?> getAllDemos() {
        return ResponseEntity.ok(iDemoService.getAllDemos());
    }
}
