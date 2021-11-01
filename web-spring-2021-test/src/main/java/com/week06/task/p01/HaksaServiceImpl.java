package com.week06.task.p01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HaksaServiceImpl implements HaksaService {
	
	private Student student;
	
	@Autowired
	@Qualifier("heojuhwan")
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
