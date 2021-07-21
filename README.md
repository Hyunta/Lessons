# 210721 Status

## ⛏️기술 스택

### Backend
- Java
- Spring Boot , Spring MVC, Spring Data JPA
- JPA
- Junit5, Junit4
- Gradle, Maven
- IntelliJ, Visual Studio Code
- Git
### DevOps

- AWS EC2, Lambda
- MySQL, MariaDB
- NginX, Apache, Tomcat

### Data Science

- Python, TensorFlow, Pandas
- ML: Decision Tree, Random Forest, XGBoost, LGBM
- DL: CNN, RNN, LSTM, VGGNet, RESNet
- Jupyter Notebooks


## 💻Projects
### [Dacon] 위성 영상을 활용한 북극 해빙 예측 AI 경진대회
[대회 안내 사이트](https://dacon.io/competitions/official/235706/overview/description) 

기간: 2020.03 ~ 2020.04

1978년부터 40년간(482개월) 의 해빙농도, 북극점, 해안선, 육지마스크 데이터를 통해 2년간 해빙농도를 예측하는 과제
- CNN을 이용해서 MAE/F1 Score 약 4.8을 기록
- VGGNet, RESNet 을 사용해봤지만 오히려 기록이 나빠짐
	- 데이터가 482개 뿐이라 과적합(Overfit)의 문제 발생
- RNN에 LSTM을 이용하여 예측 후 약 4.6점으로 오차 감소
	- 여전히 데이터가 부족해서 데이터 증강 시도
- 대회 최종 순위 11위로 마감
- 코드 제출 기한을 모르고 제출을 못함
- 수상했다면 최종순위 8위로 수상

대회진행과정 및 source:
https://github.com/Hyunta/sea_ice_prediction



## 👨‍🏫Lesson
### [생활코딩] Python & Ruby
📺[YouTube 강의 ](https://www.youtube.com/watch?v=YuC__aN-v04&list=PLuHgQVnccGMA0lO0qip6Phh6UL73TS0es)

기간: 2020.08 ~ 2020.10

코딩에 처음 입문하게된 강의, 단순한 Python에 대한 궁금증에 배워보고 싶어서 친구의 소개로 egoing 님을 만나게된다.

- "Hello World!"를 Python으로 입문하게 됐다.
- Ruby와 병행하여 진행한 수업으로 Computing에 대해 이해하게 하도록 한 강의
- 코드의 반복을 줄이고 객체지향프로그래밍(OOP)에 대한 첫 경험
- Python의 Class와 Ruby의 모듈을 구현해보고 코딩의 맛을 봤다.

source: https://github.com/Hyunta/Lessons/tree/master/Python/egoing_python_and_ruby

### [국비지원교육] 빅데이터 분석 플랫폼을 활용한 AI개발 전문가 과정
기간: 2020.11 ~ 2021.03

유튜브 강의를 듣다 전문기관에서 배우고자 모교에서 진행하는 국비교육에 참가. 비전공자대상 수업이라 기초부터 진행. 코로나로 인해 2개월간 비대면 수업 후 21년 1월부터 대면 수업.

- Java, Python 기본 언어 학습
- DBMS 수업 (MariaDB, MySQL) query 문법 기초 학습
- Django Framework 사용한 MVT 패넡 학습
- Django를 이용하여 웹크롤링, 카카오 로그인 API 구현
- Google speechToText API를 이용하여 음성인식 기능 구현
- Apache, Tomcat, JSP, MySQL로 웹 서버 구축
- DB 이중화, Apache로 Tomcat 로드 밸런싱, Tomcat 세션 클러스터링 실습
- AWS를 이용하여 웹서버 구현 실습(EC2, S3_Bucket, Lambda)
- Docker를 이용해 하둡 HDFS를 이용한 데이터 저장 실습
- Hive를 이용한 빅 데이터 검색 실습
- 머신러닝(DecisionTree, RandomForest, XGBoost) 학습

### [생활코딩] WEB- HTML,CSS and JavaScript
📺[YouTube 강의](https://www.youtube.com/watch?v=tZooW6PritE&list=PLuHgQVnccGMDZP7FJ_ZsUrdCGH68ppvPb)

기간: 2020.12

Django에서 WebCrawling을 하다 HTML 문법을 몰라서 복사 붙여넣기만 하고 간단한 내용을 수정하거나 추가하지 못해 HTML부터 JavaScript까지 수강.

source: https://github.com/Hyunta/Lessons/tree/master/Front_end/egoing_html_css_js

### [NomadCoder] 바닐라 JS로 크롬 앱 만들기
📺[강의소개](https://nomadcoders.co/javascript-for-beginners)

기간: 2020.12

Cartoon Crawling을 하던 중 JsonType을 간단하게 수정해야하는 일이 생겼는데 JavaScript 문법을 몰라서 찾아보면서 하다가 조금 더 실습을 해보고 싶어서 JavaScript를 이용해서 크롬 앱을 만들었다.

source:
https://github.com/Hyunta/Lessons/tree/master/Front_end/nomadcoder_making_chromeapp_js

### [생활코딩] Linux란 무엇인가?
📺[YouTube 강의](https://www.youtube.com/watch?v=bCAQSdnB9pA&list=PL95D210F993B6A56A)

기간: 2020.12

국비교육에서 진행한 Linux 수업을 이해하지 못하여 개인적으로 강의를 수강. 주로 서버 구축을 가벼운 Linux 환경에서 한다고 하여 경험해보고 싶었음. 터미널을 사용을 잘해보고 싶은 마음에 시작.

- 터미널에서 파일 및 디렉토리를 검색하고 프로세스 스케쥴에 대한 명령어 학습
- vim 다루는 방법에 대한 학습

### [Inflearn] 파이썬 알고리즘 문제풀이(코딩테스트 대비)
📺[강의소개](https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8/dashboard)

기간: 2020.01 ~ 2020.03

대형 트래픽이 발생하는 서비스 회사에 입사하려면 코딩테스트가 필수임을 인지하고 준비시작. 

언어에 대한 고민이 있었는데 Python과 Java 중 고민하다 서점에서 [파이썬 알고리즘 인터뷰](http://www.kyobobook.co.kr/product/detailViewKor.laf?mallGb=KOR&ejkGb=KOR&barcode=9791189909178)을 읽고 Python으로 선택

- python을 사용은 해봤지만 알고리즘 풀이가 처음이라 한 문제에 고민하는 시간이길었고 처음 2~3주는 매일 3~4시간씩 고민하고 기본적인 문법을 공부했다.
- 완강을 하고나서 자료구조에 대한 이해는 물론 python을 자유자재로 구사할 수 있게 되었다.
- 이 강의로 Base를 다지고 꾸준히 Programmers와 Baekjoon에서 문제를 풀고 있다.
- (21.07.21) programmers lv1,lv2는 모두 풀었고 현재 716등이다.

source:
https://github.com/Hyunta/TIL/tree/master/Algorithm/inflearn


### [Inflearn] 예제로 배우는 스프링 입문, 백기선
📺[강의 소개](https://www.inflearn.com/course/spring_revised_edition/dashboard)

기간: 2021.03

조금 부끄러운 경험인데 강의를 들었지만 이해한 내용은 정말 아무것도 없다. IntelliJ가 익숙치 않아 단축키 찾아보느라 급급했다. 스프링이 무엇인지 알고 싶었지만 오히려 더 모르게 되는 순간이었다. Java와 기본적인 servlet 구조 웹 애플리케이션 서비스가 어떻게 작동하는지도 잘 모르고 덤볐다가 호되게 당했다.

- 성급한 공부를 중단하고 다시 Java와 JSP 공부를 이어갔다.



### [Inflearn] 자바 프로그래밍 입문 강좌 & 실전 JSP
📺[강의 소개](https://www.inflearn.com/course/%EC%8B%A4%EC%A0%84-%EC%9E%90%EB%B0%94_java-renew/dashboard)

기간: 2021.03

국비교육이 마치고 Backend에 관심을 갖고 웹 서비스 쪽을 공부하기로 했다. 최종적으로는 Spring을 학습하기 위해 서블릿을 먼저 학습했다. 그러다 JSP와 Java와 병행하여 공부하고자 inflearn에서 제공되는 강의를 수강했다.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_jsp


### [Inflearn_김영한] 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

📺[강의 소개](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8/dashboard)

기간: 2021.04

스프링에 대해 본격적인 공부가 시작됐다. 김영한 강사님의 설명을 통해 스프링을 전반적으로 이해할 수 있었고 가벼운 예제를 통해 코드를 구현하여 기능을 보여주었다.

- SpringBoot를 통해 프로젝트를 생성하고 MVC 패턴, 템플릿 학습
- 요구사항을 통해 도메인, 레포지토리, 서비스 생성
- 테스트 케이스를 만들어보는 실습
- 스프링 빈에 대한 이해와 웹 MVC 개발
- H2, JDBC, JPA를 통해 DB에 접근

아무래도 입문 강의다 보니 다루는 내용이 방대했고 전반적인 틀을 잡아주는 강의였다. 당시에는 이해가 안되더라도 우선 구현을 하고 넘어간 다음에 강의를 전체 듣고나서 돌아오기로 했다.

(21.07.21) 스프링 핵심원리, MVC 1,2편 JPA 1편을 수강했다. 다시 이 강의 목차를 보는데 예전과는 확실히 달라졌다.














## 🏃‍♂️Personal Experience
### [조코딩] 파이썬 주식 투자 자동화
📺[Youtube 영상](https://youtu.be/5bTxyBeOVkA)

기간: 2021.01

Django를 사용하며 Python에 익숙해지고 현실 문제를 해결해보고 싶었다. 주식 가격이 오르고 내리는 것에 일정한 규칙이 있는 것 같아서 자동 주문하는 시스템을 만들어 보았다. 내가 원하는 방식으로 구현하는 과정에 예외처리하느라 고생했다.

- CREON Open API를 이용하여 대신증권 주식 정보를 활용
- Slack API를 이용하여 자동으로 알림을 주는 봇을 만듬
- 윈도우 작업 스케쥴러로 정해진 시간에 자동으로 실행하도록 구현

source:
https://github.com/Hyunta/Lessons/tree/master/Python/jocoding_auto_stock

### [개인]Dacon 대회 과정 서버 구축하기
기간 2021.03

국비교육 최종 프로젝트로 Dacon 참가를 마치고 이를 서버에다 올려보고 싶었다. Linux OS에 Apache 서버를 열고 간단하게 HTML 페이지를 구성하여 만들었다.

- AWS EC2 인스턴스를 생성하여 ubuntu 서버를 만들고 apache를 실행했다.
- Windows OS에서 Linux로 Html 파일을 전송하는데 WinSCP를 이용하여 전송했다.
- nginx와 apache에 대한 공부를 하고 자연스럽게 프로세스와 쓰레드를 익혔다.

source:
https://github.com/Hyunta/sea_ice_prediction







​    