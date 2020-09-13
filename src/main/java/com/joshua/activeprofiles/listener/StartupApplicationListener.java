package com.joshua.activeprofiles.listener;

import com.joshua.activeprofiles.service.EnvService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private final EnvService envService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        envService.printActiveProfiles();
    }
}
