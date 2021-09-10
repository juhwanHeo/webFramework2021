package com.week2.meet.sample2;

public class MessageBeanEn implements MessageBean {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!!!");
    }
}
