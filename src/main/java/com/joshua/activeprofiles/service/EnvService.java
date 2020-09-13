package com.joshua.activeprofiles.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Slf4j
@Service
@RequiredArgsConstructor
public class EnvService {

    private final Environment env;

    public void printActiveProfiles() {
        log.info("active profiles : {}", Arrays.toString(env.getActiveProfiles()));
    }
}
