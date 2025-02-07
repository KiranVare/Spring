package com.kiran.spring.core.spring_boot_core.Controller;

import com.kiran.spring.core.spring_boot_core.Services.LoginServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

    private LoginServices loginServices;

//we use qualifier to decide which service to use otherwise we use @primary without using @Qualifier to set the default
//    public HomeController(@Qualifier("mySqlLoginImpl") LoginServices loginServices) {
//        this.loginServices = loginServices;
//    }

    public HomeController(LoginServices loginServices) {
        this.loginServices = loginServices;
    }

    public void loginUser() throws InterruptedException {
        loginServices.login();
        System.out.println("login successful ");
    }

    public void logoutUser() throws InterruptedException {
        loginServices.logout();
        System.out.println("logout successful");
    }



}
