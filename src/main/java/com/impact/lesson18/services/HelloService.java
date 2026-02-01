package com.impact.lesson18.services;
import com.impact.lesson18.constants.AppConstants;

public class HelloService {
    public HelloService(){
        AppConstants appConstants = new AppConstants();
    };

    public String sayHello(){
        return AppConstants.HelloWorld;
    }

}
