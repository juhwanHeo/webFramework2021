# webFramework2021
## 0, Project
```
2021년 2학기 [웹프레임워크활용] 기말시험은 프로젝트로 대체합니다.

1. 프로젝트 핵심 주제 : "청탁을 필터링할 대체 수단"

2. 프로젝트 세부 주제 : 자유

3. 프로젝트 발표 : 12월20일 월요일 7-8교시, A1400 강의실

4. 프로젝트 산출물 및 보고서 제출 마감일 : 12월20일 월요일 오후 5시까지 제출 마감

5. 산출물 : 보고서(양식 제공)

6. 제출방법 : 스마트 리드에 산출물 및 보고서 온오프라인 제출 (보고서는 온라인에 1부, 오프라인으로 원본 출력하여 직접 제출 1부)

7. 기타 : 수업 시간에 프로젝트 관련 자세한 설명합니다.
```
## 1, 세부 주제 : 대학 입학 시험 정보를 활용한 부정입학을 필터하기

## 2, ORM : Mybatis [(참고1)](https://ming9mon.tistory.com/64), [(참고2)](https://twofootdog.github.io/Spring-DAO%EC%99%80-Mapper%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90/)

## 3, DB: Mariadb
- ### ERD
![ERD_211208](https://user-images.githubusercontent.com/47820142/145184841-12ade7d8-9d57-49ca-964c-8ac08278f295.PNG)

  - #### College 
    - 대학 정보 테이블

  - #### College 
    - 대학 입학 시헙 정보 테이블

  - #### Student
    - 학생 정보 테이블

  - #### Entrance_grade 
    - 학생 입시점수 테이블

  - #### Dae_cd
    - 대코드 테이블

  - #### So_cd
    - 소코드 테이블

 - ### 쿼리 예시 
 #### 부정입학이 `아닌경우`
  ```sql
SELECT 
	cc.*
	,eg.id 
	, sd.name 
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
	AND eg.score >= ce.min_score
	AND eg.csat_score <= ce.min_csat_score;
  ```
 - ### 쿼리 결과 
|college_id|college_nm|id|name|exam_type|exam_type_nm|min_csat_score|min_score|csat_score|score|entrance_yn|
|---|---|---|---|---|---|---|---|---|---|---|
|1|한국대학교|juhwan|허주환|001001|수시 학생부교과전형|2.00|70.34|1.92|83.30|Y|

#### `부정입학인 경우`
  ```sql
SELECT 
	cc.*
	,eg.id 
	, sd.name 
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
	AND (eg.score < ce.min_score OR eg.csat_score > ce.min_csat_score)
  ```
 - ### 쿼리 결과 
|college_id|college_nm|id|name|exam_type|exam_type_nm|min_csat_score|min_score|csat_score|score|entrance_yn|
|---|---|---|---|---|---|---|---|---|---|---|
|1|한국대학교|bujung|김부정|001001|수시 학생부교과전형|2.00|70.34|2.1|73.38|Y|
 
## 2, Change Logs
  - [2021.12.01.md](https://github.com/juhwanHeo/webFramework2021/blob/main/project/changeLogs/21.12.01.md)
  - [2021.12.08.md](https://github.com/juhwanHeo/webFramework2021/blob/main/project/changeLogs/21.12.08.md)
  - [2021.12.09.md](https://github.com/juhwanHeo/webFramework2021/blob/main/project/changeLogs/21.12.09.md)
