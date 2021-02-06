package com.mk.springcloud.microservice.controller;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

public interface ITestService {

    @Async
    Future<String> doActionAsync();

    String doAction();
}
