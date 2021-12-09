package com.project.vo;

import java.util.Objects;

public class EntranceGrade {
	private String college_id;
	private String id;
	private String exam_type;
	private double score;
	private double csat_score;
	private String entrance_yn;

	private String name;
	private String college_nm;
	private String exam_type_nm;

	private double min_score;
	private double min_csat_score;

	public String getCollege_id() {
		return college_id;
	}

	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExam_type() {
		return exam_type;
	}

	public void setExam_type(String exam_type) {
		this.exam_type = exam_type;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getCsat_score() {
		return csat_score;
	}

	public void setCsat_score(double Csat_score) {
		this.csat_score = Csat_score;
	}

	public String getEntrance_yn() {
		return entrance_yn;
	}

	public void setEntrance_yn(String entrance_yn) {
		this.entrance_yn = entrance_yn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege_nm() {
		return college_nm;
	}

	public void setCollege_nm(String college_nm) {
		this.college_nm = college_nm;
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

	public double getMin_Csat_score() {
		return min_csat_score;
	}

	public void setMin_Csat_score(double min_Csat_score) {
		this.min_csat_score = min_Csat_score;
	}
	
	public boolean isPass() {
		return this.entrance_yn.equals("Y");
	}

	@Override
	public int hashCode() {
		return Objects.hash(college_id, exam_type, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntranceGrade other = (EntranceGrade) obj;
		return Objects.equals(college_id, other.college_id) && Objects.equals(exam_type, other.exam_type)
				&& Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return "EntranceGrade [college_id=" + college_id + ", id=" + id + ", exam_type=" + exam_type + ", score="
				+ score + ", Csat_score=" + csat_score + ", entrance_yn=" + entrance_yn + ", name=" + name
				+ ", college_nm=" + college_nm + ", exam_type_nm=" + exam_type_nm + ", min_score=" + min_score
				+ ", min_Csat_score=" + min_csat_score + "]";
	}

}
