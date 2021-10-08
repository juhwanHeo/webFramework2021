package com.week6.meet.p01;

public abstract class HaksaService {

	protected Student student;
	
	public boolean isGraduation() {
		if(student.getHakjum() >= 120) return true;
		return false;
		
	}
	
	abstract void setStudent(Student student);
	abstract void print();
	abstract void printDetail();
	
}
