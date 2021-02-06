package com.mk.springcloud.microservice.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
@Service
public class TestService implements ITestService{

    @Override
    @Async
    public Future<String> doActionAsync(){

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult(doAction());
    }

    @Override
    public String doAction() {

        return "done";
    }
}
