# BusLocationTrackServer
## Database : MariaDB
### docker ([참고](https://logical-code.tistory.com/122))


```bash
# 모든 컨테이너를 종료하고 삭제한다.
$ docker stop $(docker ps -a -q)
$ docker rm $(docker ps -a -q)

# DB 처음 시작
$ docker run --name mariadb -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mariadb mariadb
```
*****
`컨테이너 시작 종료`
```bash
# 컨테이너 종료
$ docker stop mariadb

# 컨테이너 종료 후 시작
$ docker start mariadb
```
*****  
`DB Bash` 접속
```bash
# postgres bash접속
$ docker exec -it mariadb /bin/bash

# DB 연결
$ mysql -u root -p
```
*****
`DB 접속 ip` 찾기
```bash
$ docker-machine ip default
```
