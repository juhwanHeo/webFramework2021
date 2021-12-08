package com.project.vo;

public class CollegeExam {
	private String college_id;
	private String exam_type;
	private String exam_type_nm;
	private double min_score;
	private double min_csat_score;

	private String college_nm;

	public String getCollege_id() {
		return college_id;
	}

	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}

	public String getExam_type() {
		return exam_type;
	}

	public void setExam_type(String exam_type) {
		this.exam_type = exam_type;
	}

	public String getExam_type_nm() {
		return exam_type_nm;
	}

	public void setExam_type_nm(String exam_type_nm) {
		this.exam_type_nm = exam_type_nm;
	}

	public double getMin_score() {
		return min_score;
	}

	public void setMin_score(double min_score) {
		this.min_score = min_score;
	}

	public double getMin_csat_score() {
		return min_csat_score;
	}

	public void setMin_csat_score(double min_cast_score) {
		this.min_csat_score = min_cast_score;
	}

	public String getCollege_nm() {
		return college_nm;
	}

	public void setCollege_nm(String college_nm) {
		this.college_nm = college_nm;
	}

	@Override
	public String toString() {
		return "CollegeExam [college_id=" + college_id + ", exam_type=" + exam_type + ", exam_type_nm=" + exam_type_nm
				+ ", min_score=" + min_score + ", min_csat_score=" + min_csat_score + ", college_nm=" + college_nm
				+ "]";
	}
	

}
