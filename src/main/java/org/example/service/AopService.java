package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.log.Logger;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AopService {

    @Autowired
    private Logger log;

    public void service() {
        log.info("call AopService.service()");
    }

    public void anotherService() {
        log.info("call AopService.anotherService()");
        ((AopService)AopContext.currentProxy()).service();
    }

}
