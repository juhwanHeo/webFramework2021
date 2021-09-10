package com.week2.meet.sample2;

public class HelloApp {
    public static void main(String[] args) {
        MessageBean bean1 = new MessageBeanEn();
        MessageBean bean2 = new MessageBeanKr();
        /*
        *
        * 인터페이스는 코딩상 규약으로서의 기능을 하기 때문에 변경에 강한 애플리캐이션을 만들 수 있는 무기가 됨
        * */
        bean1.sayHello("허주환");
        bean2.sayHello("허주환");
    }
}
