package com.week2.meet.sample1;

public class HelloApp {
    public static void main(String[] args) {
        MessageBean bean = new MessageBean();
        /*
        * 해당 클래스의 구현에 강하게 의존하게 됨( 강한결합)
        * 클래스간 결합이 강해지고
        * 의존하고 있는 클래스에 변경이 생기면 코드를 수정해야 하는 범위가 넓어질 가능성이 높아짐
        * */
        bean.sayHello("허주환");
    }
}
