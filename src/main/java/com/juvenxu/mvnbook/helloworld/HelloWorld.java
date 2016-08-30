package com.juvenxu.mvnbook.helloworld;

/**
 * Created by wangqi on 16/8/30.
 */
public class HelloWorld {
    public String sayHello() {
        return "Hello Maven";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }

}
