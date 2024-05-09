package com.example.testdocker.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
@Slf4j
public class WebRestController {

    @Autowired
    private Environment environment;

    @GetMapping("/app-profile")
    public String getAppProfile(){
        String result = Arrays.stream(environment.getActiveProfiles()).findFirst().orElse("");
        log.info("app-profile = {}",result);
        return result;
    }
}
