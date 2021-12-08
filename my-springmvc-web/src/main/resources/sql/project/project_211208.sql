-- create
CREATE TABLE college (
	college_id INT NOT NULL AUTO_INCREMENT COMMENT '대학교아이디',
	college_nm VARCHAR(100) COMMENT '대학교명',
	primary key(college_id)
);

CREATE TABLE college_exam (
	college_id INT COMMENT '대학교아이디',
	exam_type VARCHAR(6) DEFAULT NULL COMMENT '입시 시험 종류',
	min_score DECIMAL(5,2) DEFAULT -1.00 COMMENT '수시 최저점수',
	min_csat_score DECIMAL(5,2) DEFAULT -1.00 COMMENT '대학수학능력시험 최저점수',
	primary key(college_id, exam_type)
);

CREATE TABLE student (
	id VARCHAR(30) NOT NULL COMMENT '학생아이디',
	name VARCHAR(30) NOT NULL COMMENT '학생이름',
	age INT NOT NULL COMMENT '학생나이',
	primary key(id)
);

CREATE TABLE entrance_grade (
	college_id INT COMMENT '대학교아이디',
	id VARCHAR(30) NOT NULL COMMENT '학생아이디',
	exam_type VARCHAR(6) DEFAULT NULL COMMENT '입시 시험 종류',
	score DECIMAL(5,2) DEFAULT NULL COMMENT '수시 점수',
  	csat_score decimal(5,2) DEFAULT -1.00 COMMENT '대학수학능력평가 점수',
  	entrance_yn CHAR(1) DEFAULT 'N' COMMENT '입학여부',
	primary key(college_id, id, exam_type)	
);

CREATE TABLE dae_cd (
	dae_code VARCHAR(3) NOT NULL COMMENT '대코드',
	dae_nm VARCHAR(100) NOT NULL COMMENT '대코드명',
	primary key(dae_code)
);

CREATE TABLE so_cd (
	dae_code VARCHAR(3) NOT NULL COMMENT '대코드',
	so_code VARCHAR(6) NOT NULL COMMENT '소코드',
	so_nm VARCHAR(100) NOT NULL COMMENT '소코드명',
	primary key(so_code)
);

-- alert foreign key


ALTER TABLE college_exam
	ADD CONSTRAINT FK_college_college_exam
	FOREIGN KEY (college_id)
	REFERENCES college(college_id);

ALTER TABLE entrance_grade 
	ADD CONSTRAINT FK_student_entrance_grade 
	FOREIGN KEY (id)
	REFERENCES student(id);

ALTER TABLE entrance_grade 
	ADD CONSTRAINT FK_college_exam_entrance_grade 
	FOREIGN KEY (college_id)
	REFERENCES college_exam(college_id);

ALTER TABLE so_cd 
	ADD CONSTRAINT FK_socode_daecode
	FOREIGN KEY (dae_code)
	REFERENCES dae_cd(dae_code);
-- insert data

INSERT INTO college(college_id , college_nm)
VALUES (1, '한국대학교');
INSERT INTO college(college_id , college_nm)
VALUES (2, '한림대학교');

INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (1, '001001', 70.34, 2.2);
INSERT INTO college_exam(college_id , exam_type, min_score, min_csat_score)
VALUES (1, '001002', 83.05, 2.8);

INSERT INTO student(id, name, age)
VALUES ('juhwan', '허주환', 23);

INSERT INTO entrance_grade(college_id, id, exam_type, score, csat_score, entrance_yn)
VALUES ('1', 'juhwan', '001001', 83.3, 2.1, 'Y');

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


-- select

select 
	ss.*
	, (select so_nm from so_cd  where so_code = eg.exam_type) as exam_type
	, eg.score 
	, eg.entrance_yn 
from 
	student ss
	, entrance_grade eg
where
	ss.id = eg.id;

SELECT 
	eg.id 
	, sd.name 
	, cc.*
	, ce.exam_type 
	, (select so_nm from so_cd  where so_code = ce.exam_type) as exam_type_nm
	, ce.min_csat_score 
	, ce.min_score 
	, eg.csat_score 
	, eg.score 
	, eg.entrance_yn 
FROM 
	college cc
	, college_exam ce
	, entrance_grade eg
	, student sd
WHERE 1=1 
	AND cc.college_id = ce.college_id
	AND cc.college_id = eg.college_id 
	AND ce.exam_type = eg.exam_type
	AND sd.id = eg.id ;


SELECT 
	eg.id 
	, sd.name 
	, cc.*
	, ce.exam_type 
	, (select so_nm from so_cd  where so_code = ce.exam_type) as exam_type_nm
	, ce.min_csat_score 
	, ce.min_score 
	, eg.csat_score 
	, eg.score 
	, eg.entrance_yn 
FROM 
	college cc
	, college_exam ce
	, entrance_grade eg
	, student sd
WHERE 1=1 
	AND cc.college_id = ce.college_id
	AND cc.college_id = eg.college_id 
	AND ce.exam_type = eg.exam_type
	AND sd.id = eg.id
	AND cc.college_id = 1
	AND ce.exam_type = '001001'
	AND (eg.score < ce.min_score
	OR eg.csat_score > ce.min_csat_score)
						
SELECT
	cc.college_id
	,cc.college_nm
	, (select so_nm from so_cd  where so_code = ce.exam_type) as exam_type
	, ce.min_score 
	, ce.min_csat_score 
FROM
	college cc
	, college_exam ce
WHERE 1=1
	AND cc.college_id = ce.college_id
	AND ce.college_id = 1;