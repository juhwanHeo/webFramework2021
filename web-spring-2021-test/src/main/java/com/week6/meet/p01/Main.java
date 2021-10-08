package com.week6.meet.p01;


public class Main {
	
	public static void main(String[] args) {
		Student nagildong = new Student();
		nagildong.setCollegeName("한림대학교");
		nagildong.setAffiliation("소프트웨어 융합대학");
		nagildong.setMajor("소프트웨어");
		nagildong.setStudent_id("20181234");
		nagildong.setName("나길동");
		nagildong.setHakjum(135);

		Student jedong = new Student();
		jedong.setCollegeName("한림대학교");
		jedong.setAffiliation("소프트웨어 융합대학");
		jedong.setMajor("기술 융합");
		jedong.setStudent_id("20195678");
		jedong.setName("제동이");
		jedong.setHakjum(117);
		
		HaksaService service = new HaksaServiceImpl();
		service.setStudent(nagildong);
		service.print();
		service.printDetail();

		service.setStudent(jedong);
		service.print();
		service.printDetail();
		
	}
}
