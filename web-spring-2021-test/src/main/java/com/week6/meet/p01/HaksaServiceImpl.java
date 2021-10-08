package com.week6.meet.p01;

public class HaksaServiceImpl extends HaksaService {
	
	@Override
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Override
	public void print() {
		System.out.println("1. 세부전공 : " + student.getMajor());
		System.out.println("2. 학번 : " + student.getStudent_id());
		System.out.println("3. 졸업가능여부 : " + (isGraduation() ? "졸업 확정" : "졸업 유보"));
		System.out.println("\n/-------------------------------/\n");
		
	}

	@Override
	public void printDetail() {
		System.out.println("1. 대학교명 : " + student.getCollegeName());
		System.out.println("2. 소속 : " + student.getAffiliation());
		System.out.println("3. 세부전공 : " + student.getMajor());
		System.out.println("4. 학번 : " + student.getStudent_id());
		System.out.println("5. 성명 : " + student.getName());
		System.out.println("6. 졸업이수학점 : " + student.getHakjum());
		System.out.println("7. 졸업가능여부: " + (isGraduation() ? "졸업 확정" : "졸업 유보"));
		System.out.println("\n/===============================/\n");
		
	}

}
