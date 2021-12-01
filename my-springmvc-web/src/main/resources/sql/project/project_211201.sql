CREATE TABLE student (
	id VARCHAR(30) NOT NULL COMMENT '학생아이디',
	name VARCHAR(30) NOT NULL COMMENT '학생이름',
	age INT NOT NULL COMMENT '학생나이',
	
	primary key(id)
);

CREATE TABLE entrance_grade (
	id VARCHAR(30) NOT NULL COMMENT '학생아이디',
	exam_type VARCHAR(6) DEFAULT NULL COMMENT '입시 시험 종류',
	score DECIMAL(5,2) DEFAULT NULL COMMENT '수시 점수',
  	csat_score decimal(5,2) DEFAULT -1.00 COMMENT '대학수학능력평가 점수',
  	entrance_yn CHAR(1) DEFAULT 'N' COMMENT '입학여부'
);

ALTER TABLE entrance_grade 
	ADD CONSTRAINT FK_student_entrance_grade 
	FOREIGN KEY (id)
	REFERENCES student(id);

INSERT INTO student(id, name, age)
VALUES ('juhwan', '허주환', 23);

INSERT INTO entrance_grade(id, exam_type, score, entrance_yn)
VALUES ('juhwan', '001001', 83.3, 'Y');

--
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

ALTER TABLE so_cd 
	ADD CONSTRAINT FK_socode_daecode
	FOREIGN KEY (dae_code)
	REFERENCES dae_cd(dae_code);

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
	
