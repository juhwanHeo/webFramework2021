package com.project.vo;

public class College {
	private String college_id;
	private String college_nm;

	public String getCollege_id() {
		return college_id;
	}

	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}

	public String getCollege_nm() {
		return college_nm;
	}

	public void setCollege_nm(String college_nm) {
		this.college_nm = college_nm;
	}

	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_nm=" + college_nm + "]";
	}

}
