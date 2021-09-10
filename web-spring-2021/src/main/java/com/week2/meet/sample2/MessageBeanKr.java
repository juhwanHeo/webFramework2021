package com.week2.meet.sample2;

public class MessageBeanKr implements MessageBean{

    @Override
    public void sayHello(String name) {
        System.out.println("안녕하세요, " + name + "!!!");
    }
}
