package org.example.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PlatformLogger implements Logger {
    public void info(String message) {
        log.info(message);
    }
}
