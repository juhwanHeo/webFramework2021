package com.week4.task.before2.behavior.observe;

/*
 * 디자인 행위 패턴: 옵저버
 * https://coding-factory.tistory.com/710
*/
public class ObserverTest {
	public static void main(String[] args) {
		Notice notice = new Notice();
		UserA userA = new UserA("User A");
		UserB userB = new UserB("User B");
		
		notice.attach(userA);
		notice.attach(userB);
		
		String msg = "공지사항입니다.!";
		notice.notifyObservers(msg);

		notice.detach(userA);
		msg = "안녕하세요";
		notice.notifyObservers(msg);
		
	}

}
