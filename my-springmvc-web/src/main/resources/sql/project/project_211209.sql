-- foreign key
ALTER TABLE entrance_grade 
	ADD CONSTRAINT FK_college_exam_entrance_grade 
	FOREIGN KEY (college_id, exam_type)
	REFERENCES college_exam(college_id, exam_type);
-- data
INSERT INTO dae_cd(dae_code , dae_nm)
VALUES ('001', '수시');
INSERT INTO so_cd(dae_code , so_code, so_nm)
VALUES ('001', '001001', '수시 학생부교과전형');
INSERT INTO so_cd(dae_code , so_code, so_nm)
VALUES ('001', '001002', '수시 학생부종합전형');
INSERT INTO so_cd(dae_code , so_code, so_nm)
VALUES ('001', '001003', '수시 논술전형');
INSERT INTO so_cd(dae_code , so_code, so_nm)
VALUES ('001', '001004', '수시 실기전형');

INSERT INTO dae_cd(dae_code , dae_nm)
VALUES ('002', '정시');
INSERT INTO so_cd(dae_code , so_code, so_nm)
VALUES ('002', '002001', '정시 단일전형(수능위주)');

INSERT INTO college(college_id , college_nm)
VALUES (1, '한국대학교');
INSERT INTO college(college_id , college_nm)
VALUES (2, '한림대학교');

INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (1, '001001', 70.34, 2.2);
INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (1, '001002', 83.05, 2.8);
INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (1, '002001', 0, 1.5);
INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (2, '001001', 67.34, 3.2);
INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (2, '001002', 84.05, 4.0);

INSERT INTO student(id, name, age)
VALUES ('juhwan', '허주환', 23);
INSERT INTO student(id, name, age)
VALUES ('bujung', '김부정', 23);
INSERT INTO student(id, name, age)
VALUES ('kamja', '김감자', 23);
INSERT INTO student(id, name, age)
VALUES ('guma', '고구마', 22);
INSERT INTO student(id, name, age)
VALUES ('oi', '이오이', 22);
INSERT INTO student(id, name, age)
VALUES ('hapgyeok', '난합격', 22);

INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'juhwan', '001001', 83.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'bujung', '001001', 83.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'kamja', '001001', 71.1, 2.4, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'guma', '001001', 67.1, 2.8, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'oi', '001001', 69.7, 1.99, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'hapgyeok', '001001', 91.87, 1.25, 'Y');
--
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'juhwan', '001002', 83.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'bujung', '001002', 83.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'kamja', '001002', 71.1, 2.4, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'guma', '001002', 67.1, 2.8, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'oi', '001002', 69.7, 1.99, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'hapgyeok', '001002', 91.87, 1.25, 'Y');
--
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'juhwan', '002001', 83.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'bujung', '002001', 83.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'kamja', '002001', 71.1, 2.4, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'guma', '002001', 67.1, 2.8, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'oi', '002001', 69.7, 1.99, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'hapgyeok', '002001', 91.87, 1.25, 'Y');
--
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'juhwan', '001001', 89.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'bujung', '001001', 73.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'kamja', '001001', 76.1, 2.4, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'guma', '001001', 66.1, 2.8, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'oi', '001001', 89.7, 1.99, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'hapgyeok', '001001', 91.87, 1.25, 'Y');
--
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'juhwan', '001002', 89.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'bujung', '001002', 73.3, 2.1, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'kamja', '001002', 76.1, 2.4, 'N');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'guma', '001002', 66.1, 2.8, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'oi', '001002', 89.7, 1.99, 'Y');
INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('2', 'hapgyeok', '001002', 91.87, 1.25, 'Y');