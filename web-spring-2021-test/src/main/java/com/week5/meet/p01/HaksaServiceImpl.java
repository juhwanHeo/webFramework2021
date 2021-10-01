package com.week5.meet.p01;

public class HaksaServiceImpl implements HaksaService {
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public double sum() {
		return student.getMiddleScore() + student.getFinalScore();
	}

	@Override
	public double avg() {
		return sum() / 2;
	}

	@Override
	public void print() {
		System.out.println("이름: " + student.getName());
		System.out.println("총합: " + sum());
		System.out.println("평균: " + avg());

	}

}
