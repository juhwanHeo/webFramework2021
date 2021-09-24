package com.week4.task.before2.structural.Adapter;

/*
 * 디자인 구조 패턴: 적응자 (Adapter)
 * https://niceman.tistory.com/141
 * https://www.slipp.net/wiki/display/SLS/Adapter+Pattern
*/
public class AdapterTest {
	public static void main(String[] args) {
		Captain captain = new Captain(new FishingBoatAdapter());
		captain.row();
	}
}
