package com.kiran.spring.core.spring_boot_core.Services;

import org.springframework.stereotype.Component;

@Component
public class MySqlLoginImpl implements LoginServices{
    @Override
    public void login() throws InterruptedException {
        System.out.println("Working");
        Thread.sleep(2000);
        System.out.println("logging Using mySql");
        Thread.sleep(2000);
    }

    @Override
    public void logout() throws InterruptedException {
        System.out.println("Working on logout");
        Thread.sleep(2000);
        System.out.println("logging out Using mySql");
        Thread.sleep(2000);
    }
}
