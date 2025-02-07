package com.kiran.spring.core.spring_boot_core.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OracleLoginImpl implements LoginServices{
    @Override
    public void login() throws InterruptedException {
        System.out.println("Working");
        Thread.sleep(2000);
        System.out.println("logging Using Oracle");
        Thread.sleep(2000);
    }

    @Override
    public void logout() throws InterruptedException {
        System.out.println("Working on logout");
        Thread.sleep(2000);
        System.out.println("logging out Using Oracle");
        Thread.sleep(2000);
    }
}
