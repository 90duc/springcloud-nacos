package com.mk.springcloud.microservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


@Slf4j
@Component
public class Runner implements ApplicationContextAware {

    @EventListener(ApplicationReadyEvent.class)
    public void run(){

//        TestService testService = applicationContext.getBean(TestService.class);
//        log.info("doActionAsync...");
//        Future f = testService.doActionAsync();
//        log.info("doActionAsync start...");
//        try {
//            f.get();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        log.info("doActionAsync end...");
    }

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext =applicationContext;
    }
}
