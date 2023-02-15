## 💛 BIGDATA PJT BY JKM

### ShipTraffic Live - 선박도착시간 예측 서비스(Frontend repository)

### 한 줄 소개

- AIS 신호를 활용하여 국내 선박들의 위치 정보를 실시간으로 파악 및 목적지 도착 예정 시각을 예측하여 알려주는 서비스

### 프로젝트
-  2023.01.11 ~ 2023.02.09 (일/시간)
- [Github - BackEnd](https://github.com/K-Digital-Two/JKM1-BE)

## Final Version
![image](https://user-images.githubusercontent.com/113369989/218220295-9f5e3469-520c-4dda-a110-e89d22433358.png)

## Requirements ✔️
### The fully fledged server uses the following:
+ SpringBoot 4.16.1.RELEASE
+ eclipse 4.25.0
+ apache tomcat 9.0.67

## Dependencies 📝
### There are a number of third-party dependencies used in the project. Browse the Maven pom.xml file for details of libraries and versions used.
\<dependency> <br>
\<groupId>com.mysql\</groupId> <br>
\<artifactId>mysql-connector-j\</artifactId > <br>
\<scope>runtime\</scope> <br>
\</dependency>

## Building the project 📋
### You will need:
+ Java JDK 17 or higher
+ Maven 3.0.1
+ Git
+ use MySQL database > JdbcTemplate

## Missions 🛳
+ CORS
+ MySQL datasource apply
+ REST API config
+ Position Ship Location on map 

## etc 📌
+ about spring-boot reference : http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
+ about spring-boot properties : http://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
+ about spring-boot tomcat connection : http://blog.woniper.net/231
+ about spring-boot devTools : https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html
+ about spring-boot rest api : https://spring.io/guides/gs/rest-service/
