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

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%EC%9E%85%EB%AC%B8/hello-spring



### [Inflearn_김영한] 스프링 핵심 원리 - 기본편

📺[강의 소개](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard)

기간: 2021.05 ~ 2021.06

스프링의 강력한 기능들을 소개해주는 강의, 객체 지향 프로그래밍에 대한 설명과 5가지 원칙(SOLID)를 지켜야 하는 이유를 시작으로 스프링의 필요성을 몸소 느끼게 해주었다.

- Java를 이용하여 주문하는 예제를 통해 회원, 주문 도메인과 서비스를 만들었다.
- 변동사항을 통해 기존 코드의 문제점을 제기하고 리팩터링하는 과정을 통해 문제상황을 직접 대면하고 해결했다.
- 스프링 컨테이너를 통해 문제를 해결하고 스프링 빈에 대한 이해
- 빈의 싱글톤 컨테이너를 이해
- 컴포넌트 스캔을 통한 의존관계 자동 주입
- 빈의 생명주기를 이해

강의를 다시 정리하면서 다시 들어봐야겠다는 생각이 강하게 든다. JPA 강의를 마저 듣고 처음부터 다시 들어봐야겠다.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%EC%9B%90%EB%A6%AC

### [Inflearn_김영한] 모든 개발자를 위한 HTTP 웹 기본 지식

📺[강의 소개](https://www.inflearn.com/course/http-%EC%9B%B9-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/dashboard)

기간: 2021.06

웹 애플리케이션에 대해 학습하기 전에 HTTP를 공부했다. 인터넷 네트워크가 이뤄지는 방식부터 HTTP의 메서드를 이해하고 각 메서드가 가지는 특징들을 공부했다.

- 인터넷 네트워크 (IP, TCP, UDP, PORT, DNS)
- HTTP의 구조와 메시지 형태
- 각 메서드의 특징들 (GET, POST, PUT, PATCH, DELETE)
- HTTP 상태코드


source:
https://github.com/Hyunta/Lessons/tree/master/CS/inflearn_%EB%AA%A8%EB%93%A0%20%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%A5%BC%20%EC%9C%84%ED%95%9C%20HTTP%20%EC%9B%B9%20%EA%B8%B0%EB%B3%B8%EC%A7%80%EC%8B%9D

### [Inflearn_김영한] 스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술

📺[강의 소개](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1/dashboard)

기간: 2021.06

웹 애플리케이션에 대해 학습하고 서블릿으로 구현을 했다. HTTP Request, Response를 어떻게 처리해야하는지 방법을 익히고 이를 스프링을 통해서 처리한다.

- 서블릿과 JSP를 이용해 MVC 패턴을 적용해보고 불편함 확인
- MVC 프레임워크를 직접 만들어 보았다.
	- 기본적인 프론트 컨트롤러, view, model 을 구현한다.
- 이를 스프링 MVC 구조로 가져와 이해한다.
	- 핸들러 매핑과, 뷰 리졸버의 역할을 확인한다.
- 스프링 MVC에서 HTTP 처리하는 방법을 익힌다.
- 스프링 MVC를 통해 웹 페이지를 만들며 각 기능을 구현해본다.


source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%20%EC%9B%B9%20MVC1%262/spingmvc1

### [Inflearn_김영한] 스프링 MVC 2편 - 백엔드 웹 개발 핵심 기술

📺[강의 소개](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-2/dashboard)

기간: 2021.07

1편에서 배운 기본적인 틀 외에 개발할 때 필요한 활용 기능들은 학습했다. 타임리프를 통해 템플릿을 다루고, 메시지를 이용해보고, Validation을 했다. 로그인 처리하는 방법과 예외처리 하는 방법들을 배웠다.

- 타임리프 문법을 학습하고 각 기능들을 구현해본다.
- 메시지 소스를 통해 국제화도 구현해보고 편리하게 관리한다.
- 검증하는 과정을 직접 구현하며 BindingResult의 필요성과 각 erorr을 출력하고 처리하는 과정을 구현한다.
- BeanValidation을 통해 스프링이 제공하는 기능을 구현한다.
- 로그인 처리 메커니즘을 학습하고, 세션을 통해 해결한다.
- 서블릿 필터와 스프링 인터셉터로 인증과정을 구현한다.
- 예외 처리 페이지를 처리하는 방법을 보고 Spring이 제공하는 기능을 구현한다.


source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%20%EC%9B%B9%20MVC1%262/springmvc2

### [Inflearn_김영한] 실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발

📺[강의 소개](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1/dashboard)

기간: 2021.07

프로젝트를 직접 진행하며 JPA의 쓸모를 느낀다. 기본적인 스프링 MVC에 DB접근까지 더해진 프로젝트이다. 엔티티 클래스를 만들면서 DB 설계 및 관리의 중요성을 깨달았다.

- 회원 관리, 상품 관리, 주문 관리 세 파트로 나누어진다.
- 각 도메인, 리포지토리, 서비스를 개발하고 기능을 개발한다.
- 엔티티 설계의 중요성과 도메인 주도 설계(DDD)를 학습.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8B%A4%EC%A0%84!%20%EC%8A%A4%ED%94%84%EB%A7%81%20%EB%B6%80%ED%8A%B8%EC%99%80%20JPA%20%ED%99%9C%EC%9A%A91



















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

기간: 2021.03

국비교육 최종 프로젝트로 Dacon 참가를 마치고 이를 서버에다 올려보고 싶었다. Linux OS에 Apache 서버를 열고 간단하게 HTML 페이지를 구성하여 만들었다.

- AWS EC2 인스턴스를 생성하여 ubuntu 서버를 만들고 apache를 실행했다.
- Windows OS에서 Linux로 Html 파일을 전송하는데 WinSCP를 이용하여 전송했다.
- nginx와 apache에 대한 공부를 하고 자연스럽게 프로세스와 쓰레드를 익혔다.

source:
https://github.com/Hyunta/sea_ice_prediction

### [Programmers] 프로그래머스 월간 코드 챌린지 시즌2
[대회 안내](https://programmers.co.kr/competitions/1078/monthly-code-challenge-s2)

기간: 2021.03 ~ 2021.05

코딩테스트를 한창 공부할 때 내 수준을 알고 싶어서 참가했다.
4월: 4문제 중 2.5문제를 풀어서 만족스러운 결과를 냈다.
5월에는 일정이 겹쳐서 아쉽게 참가하지 못했다.
![](https://images.velog.io/images/mohai2618/post/b2ca4350-0ba3-4d37-a653-9b977ffa8590/image.png)


### [NAVER] CLOVA AI RUSH 2021
[대회 안내](https://campaign.naver.com/clova_airush/)

기간: 2021.04~2021.06

Dacon 대회 종료 후 DeepLearning을 조금 더 공부해보고자 참가했다. 코딩테스트를 합격하여 1라운드에 진출할 기회가 주어졌다.

5가지 주제가 있었는데 내가 맡아서 해결하고자 했던 문제는 실시간 버스 도착 예정시간 예측 정확도 향상 문제였다.

한계점: Tensorflow 밖에 사용해보지 않았고 경험이 별로 없다보니 Pytorch를 다루는데 버거웠다. 모든 과정을 공부했어야 했고 그러다보니 본질적인 모델에 대한 고민보다는 툴에 대한 공부가 많아져서 2라운드 진출은 못하게 되었다.

개인적으로 아쉬움이 많이 남는다, 이 당시 Spring을 공부하고 있었고 Data Science에 너무 시간을 쏟을 수 없어서 결과가 만족스럽지 못하지만 추후에 더 공부해보고 싶은 욕심은 있다.





​    