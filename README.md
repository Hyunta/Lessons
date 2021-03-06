# 210830 Status

## ๐๐ปโโ๏ธAbout Me

### Introduction

- ์๋ํ์ธ์! ๋ฐฑ์๋ ๊ฐ๋ฐ์ ์ค๋น์ค์ธ ๊นํํ์๋๋ค.
- ์ฌํ๊ณผ ์ฒ ํ์ ๋ชฐ์ํ๋ ์ฆ๊ฑฐ์ด ์ฌ๋์๋๋ค.๐
- ์ด์ ๋ณด๋ค ๋์ ๋๋ฅผ ์ํ์ฌ 1์ผ 1์ปค๋ฐ ์ด๋๊ณผ ๋ธ๋ก๊ทธ ๊ธฐ๋ก์ ํตํด ๊ฐ๋ฐ์ค์๋๋ค.
- TDD, Clean Code๋ฅผ ํตํด ๊ฐ์ฒด ์งํฅ์  ๊ฐ๋ฐ์ ๋ํ ๊ณ ๋ฏผ์ ์ต๊ดํ ์ค์๋๋ค.
- ์ธ์์ ์๋ฆ๋ต๊ฒ ๋ง๋๋ ๊ต์ก ํ๋ซํผ์ ๋ง๋ค๊ณ  ์ถ์ต๋๋ค.



## โ๏ธ๊ธฐ์  ์คํ
### Backend
- Java
- Spring Boot , Spring MVC, Spring Data JPA
- JPA
- Junit5
- Gradle, Maven
- IntelliJ, Visual Studio Code
- Git
  
### DevOps

- AWS EC2, RDS
- MySQL, MariaDB
- NginX, Apache, Tomcat

### Data Science

- Python, TensorFlow, Pandas
- ML: Decision Tree, Random Forest, XGBoost, LGBM
- DL: CNN, RNN, LSTM, VGGNet, RESNet
- Jupyter Notebooks


## ๐ปProjects
### [Dacon] ์์ฑ ์์์ ํ์ฉํ ๋ถ๊ทน ํด๋น ์์ธก AI ๊ฒฝ์ง๋ํ
[๋ํ ์๋ด ์ฌ์ดํธ](https://dacon.io/competitions/official/235706/overview/description) 

๊ธฐ๊ฐ: 2020.03 ~ 2020.04

1978๋๋ถํฐ 40๋๊ฐ(482๊ฐ์) ์ ํด๋น๋๋, ๋ถ๊ทน์ , ํด์์ , ์ก์ง๋ง์คํฌ ๋ฐ์ดํฐ๋ฅผ ํตํด 2๋๊ฐ ํด๋น๋๋๋ฅผ ์์ธกํ๋ ๊ณผ์ 
- CNN์ ์ด์ฉํด์ MAE/F1 Score ์ฝ 4.8์ ๊ธฐ๋ก
- VGGNet, RESNet ์ ์ฌ์ฉํด๋ดค์ง๋ง ์คํ๋ ค ๊ธฐ๋ก์ด ๋๋น ์ง
	- ๋ฐ์ดํฐ๊ฐ 482๊ฐ ๋ฟ์ด๋ผ ๊ณผ์ ํฉ(Overfit)์ ๋ฌธ์  ๋ฐ์
- RNN์ LSTM์ ์ด์ฉํ์ฌ ์์ธก ํ ์ฝ 4.6์ ์ผ๋ก ์ค์ฐจ ๊ฐ์
	- ์ฌ์ ํ ๋ฐ์ดํฐ๊ฐ ๋ถ์กฑํด์ ๋ฐ์ดํฐ ์ฆ๊ฐ ์๋
- ๋ํ ์ต์ข ์์ 11์๋ก ๋ง๊ฐ
- ์ฝ๋ ์ ์ถ ๊ธฐํ์ ๋ชจ๋ฅด๊ณ  ์ ์ถ์ ๋ชปํจ
- ์์ํ๋ค๋ฉด ์ต์ข์์ 8์๋ก ์์

๋ํ์งํ๊ณผ์  ๋ฐ source:
https://github.com/Hyunta/sea_ice_prediction



### [ํํ๋ก์ ํธ] Todolist ์น ๋ง๋ค๊ธฐ

๊ธฐ๊ฐ: 2021.07 ~ 2021.08

ํ: green_muhly(๊น์๋น, ๊นํํ)

Todolist์ ๊ธฐ๋ณธ ๊ธฐ๋ฅ์ ๊ฐ์ถ ์ฐ์ต ํ๋ก์ ํธ, ๋ฐฑ์๋๋ฅผ ๋ด๋นํ์ฌ ๊ฐ๋ฐ

ํ๋ก ํธ์๋์ ํ์ํ๊ธฐ ์ํด ๊ฐ๋จํ ์น ํ์ด์ง๋ฅผ ๊ตฌํ. ๋ฐฑ์๋๋ Spring Web MVC ํจํด์ ๊ธฐ๋ฐ์ผ๋ก ๊ฐ๋ฐํ๊ณ  JPA๋ฅผ ์ด์ฉํด DB์ ์ ๊ทผํ์๋ค. AWS EC2๋ฅผ ํตํด ๋ฐฐํฌํ์๊ณ  DB๋ AWS RDS๋ฅผ ํ์ฉํ๋ค.

<์ํคํ์ณ>

![image-20210823200443510](https://github.com/Green-Muhly/todo_docs/raw/master/images/architecture.png)

๐[์ฃผ์๋งํฌ]( http://www.mohai.kro.kr:5000/)

source: https://github.com/Green-Muhly/todo_back

ํ์๋ก: https://github.com/Green-Muhly/TheMinutes



## ๐จโ๐ซLesson
### [์ํ์ฝ๋ฉ] Python & Ruby
๐บ[YouTube ๊ฐ์ ](https://www.youtube.com/watch?v=YuC__aN-v04&list=PLuHgQVnccGMA0lO0qip6Phh6UL73TS0es)

๊ธฐ๊ฐ: 2020.08 ~ 2020.10

์ฝ๋ฉ์ ์ฒ์ ์๋ฌธํ๊ฒ๋ ๊ฐ์, ๋จ์ํ Python์ ๋ํ ๊ถ๊ธ์ฆ์ ๋ฐฐ์๋ณด๊ณ  ์ถ์ด์ ์น๊ตฌ์ ์๊ฐ๋ก egoing ๋์ ๋ง๋๊ฒ๋๋ค.

- "Hello World!"๋ฅผ Python์ผ๋ก ์๋ฌธํ๊ฒ ๋๋ค.
- Ruby์ ๋ณํํ์ฌ ์งํํ ์์์ผ๋ก Computing์ ๋ํด ์ดํดํ๊ฒ ํ๋๋ก ํ ๊ฐ์
- ์ฝ๋์ ๋ฐ๋ณต์ ์ค์ด๊ณ  ๊ฐ์ฒด์งํฅํ๋ก๊ทธ๋๋ฐ(OOP)์ ๋ํ ์ฒซ ๊ฒฝํ
- Python์ Class์ Ruby์ ๋ชจ๋์ ๊ตฌํํด๋ณด๊ณ  ์ฝ๋ฉ์ ๋ง์ ๋ดค๋ค.

source: https://github.com/Hyunta/Lessons/tree/master/Python/egoing_python_and_ruby

### [๊ตญ๋น์ง์๊ต์ก] ๋น๋ฐ์ดํฐ ๋ถ์ ํ๋ซํผ์ ํ์ฉํ AI๊ฐ๋ฐ ์ ๋ฌธ๊ฐ ๊ณผ์ 
๊ธฐ๊ฐ: 2020.11 ~ 2021.03

์ ํ๋ธ ๊ฐ์๋ฅผ ๋ฃ๋ค ์ ๋ฌธ๊ธฐ๊ด์์ ๋ฐฐ์ฐ๊ณ ์ ๋ชจ๊ต์์ ์งํํ๋ ๊ตญ๋น๊ต์ก์ ์ฐธ๊ฐ. ๋น์ ๊ณต์๋์ ์์์ด๋ผ ๊ธฐ์ด๋ถํฐ ์งํ. ์ฝ๋ก๋๋ก ์ธํด 2๊ฐ์๊ฐ ๋น๋๋ฉด ์์ ํ 21๋ 1์๋ถํฐ ๋๋ฉด ์์.

- Java, Python ๊ธฐ๋ณธ ์ธ์ด ํ์ต
- DBMS ์์ (MariaDB, MySQL) query ๋ฌธ๋ฒ ๊ธฐ์ด ํ์ต
- Django Framework ์ฌ์ฉํ MVT ํจ๋ก ํ์ต
- Django๋ฅผ ์ด์ฉํ์ฌ ์นํฌ๋กค๋ง, ์นด์นด์ค ๋ก๊ทธ์ธ API ๊ตฌํ
- Google speechToText API๋ฅผ ์ด์ฉํ์ฌ ์์ฑ์ธ์ ๊ธฐ๋ฅ ๊ตฌํ
- Apache, Tomcat, JSP, MySQL๋ก ์น ์๋ฒ ๊ตฌ์ถ
- DB ์ด์คํ, Apache๋ก Tomcat ๋ก๋ ๋ฐธ๋ฐ์ฑ, Tomcat ์ธ์ ํด๋ฌ์คํฐ๋ง ์ค์ต
- AWS๋ฅผ ์ด์ฉํ์ฌ ์น์๋ฒ ๊ตฌํ ์ค์ต(EC2, S3_Bucket, Lambda)
- Docker๋ฅผ ์ด์ฉํด ํ๋ก HDFS๋ฅผ ์ด์ฉํ ๋ฐ์ดํฐ ์ ์ฅ ์ค์ต
- Hive๋ฅผ ์ด์ฉํ ๋น ๋ฐ์ดํฐ ๊ฒ์ ์ค์ต
- ๋จธ์ ๋ฌ๋(DecisionTree, RandomForest, XGBoost) ํ์ต

### [์ํ์ฝ๋ฉ] WEB- HTML,CSS and JavaScript
๐บ[YouTube ๊ฐ์](https://www.youtube.com/watch?v=tZooW6PritE&list=PLuHgQVnccGMDZP7FJ_ZsUrdCGH68ppvPb)

๊ธฐ๊ฐ: 2020.12

Django์์ WebCrawling์ ํ๋ค HTML ๋ฌธ๋ฒ์ ๋ชฐ๋ผ์ ๋ณต์ฌ ๋ถ์ฌ๋ฃ๊ธฐ๋ง ํ๊ณ  ๊ฐ๋จํ ๋ด์ฉ์ ์์ ํ๊ฑฐ๋ ์ถ๊ฐํ์ง ๋ชปํด HTML๋ถํฐ JavaScript๊น์ง ์๊ฐ.

source: https://github.com/Hyunta/Lessons/tree/master/Front_end/egoing_html_css_js

### [NomadCoder] ๋ฐ๋๋ผ JS๋ก ํฌ๋กฌ ์ฑ ๋ง๋ค๊ธฐ
๐บ[๊ฐ์์๊ฐ](https://nomadcoders.co/javascript-for-beginners)

๊ธฐ๊ฐ: 2020.12

Cartoon Crawling์ ํ๋ ์ค JsonType์ ๊ฐ๋จํ๊ฒ ์์ ํด์ผํ๋ ์ผ์ด ์๊ฒผ๋๋ฐ JavaScript ๋ฌธ๋ฒ์ ๋ชฐ๋ผ์ ์ฐพ์๋ณด๋ฉด์ ํ๋ค๊ฐ ์กฐ๊ธ ๋ ์ค์ต์ ํด๋ณด๊ณ  ์ถ์ด์ JavaScript๋ฅผ ์ด์ฉํด์ ํฌ๋กฌ ์ฑ์ ๋ง๋ค์๋ค.

source:
https://github.com/Hyunta/Lessons/tree/master/Front_end/nomadcoder_making_chromeapp_js

### [์ํ์ฝ๋ฉ] Linux๋ ๋ฌด์์ธ๊ฐ?
๐บ[YouTube ๊ฐ์](https://www.youtube.com/watch?v=bCAQSdnB9pA&list=PL95D210F993B6A56A)

๊ธฐ๊ฐ: 2020.12

๊ตญ๋น๊ต์ก์์ ์งํํ Linux ์์์ ์ดํดํ์ง ๋ชปํ์ฌ ๊ฐ์ธ์ ์ผ๋ก ๊ฐ์๋ฅผ ์๊ฐ. ์ฃผ๋ก ์๋ฒ ๊ตฌ์ถ์ ๊ฐ๋ฒผ์ด Linux ํ๊ฒฝ์์ ํ๋ค๊ณ  ํ์ฌ ๊ฒฝํํด๋ณด๊ณ  ์ถ์์. ํฐ๋ฏธ๋์ ์ฌ์ฉ์ ์ํด๋ณด๊ณ  ์ถ์ ๋ง์์ ์์.

- ํฐ๋ฏธ๋์์ ํ์ผ ๋ฐ ๋๋ ํ ๋ฆฌ๋ฅผ ๊ฒ์ํ๊ณ  ํ๋ก์ธ์ค ์ค์ผ์ฅด์ ๋ํ ๋ช๋ น์ด ํ์ต
- vim ๋ค๋ฃจ๋ ๋ฐฉ๋ฒ์ ๋ํ ํ์ต

### [Inflearn] ํ์ด์ฌ ์๊ณ ๋ฆฌ์ฆ ๋ฌธ์ ํ์ด(์ฝ๋ฉํ์คํธ ๋๋น)
๐บ[๊ฐ์์๊ฐ](https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8/dashboard)

๊ธฐ๊ฐ: 2020.01 ~ 2020.03

๋ํ ํธ๋ํฝ์ด ๋ฐ์ํ๋ ์๋น์ค ํ์ฌ์ ์์ฌํ๋ ค๋ฉด ์ฝ๋ฉํ์คํธ๊ฐ ํ์์์ ์ธ์งํ๊ณ  ์ค๋น์์. 

์ธ์ด์ ๋ํ ๊ณ ๋ฏผ์ด ์์๋๋ฐ Python๊ณผ Java ์ค ๊ณ ๋ฏผํ๋ค ์์ ์์ [ํ์ด์ฌ ์๊ณ ๋ฆฌ์ฆ ์ธํฐ๋ทฐ](http://www.kyobobook.co.kr/product/detailViewKor.laf?mallGb=KOR&ejkGb=KOR&barcode=9791189909178)์ ์ฝ๊ณ  Python์ผ๋ก ์ ํ

- python์ ์ฌ์ฉ์ ํด๋ดค์ง๋ง ์๊ณ ๋ฆฌ์ฆ ํ์ด๊ฐ ์ฒ์์ด๋ผ ํ ๋ฌธ์ ์ ๊ณ ๋ฏผํ๋ ์๊ฐ์ด๊ธธ์๊ณ  ์ฒ์ 2~3์ฃผ๋ ๋งค์ผ 3~4์๊ฐ์ฉ ๊ณ ๋ฏผํ๊ณ  ๊ธฐ๋ณธ์ ์ธ ๋ฌธ๋ฒ์ ๊ณต๋ถํ๋ค.
- ์๊ฐ์ ํ๊ณ ๋์ ์๋ฃ๊ตฌ์กฐ์ ๋ํ ์ดํด๋ ๋ฌผ๋ก  python์ ์์ ์์ฌ๋ก ๊ตฌ์ฌํ  ์ ์๊ฒ ๋์๋ค.
- ์ด ๊ฐ์๋ก Base๋ฅผ ๋ค์ง๊ณ  ๊พธ์คํ Programmers์ Baekjoon์์ ๋ฌธ์ ๋ฅผ ํ๊ณ  ์๋ค.
- (21.07.21) programmers lv1,lv2๋ ๋ชจ๋ ํ์๊ณ  ํ์ฌ 716๋ฑ์ด๋ค.

source:
https://github.com/Hyunta/TIL/tree/master/Algorithm/inflearn


### [Inflearn] ์์ ๋ก ๋ฐฐ์ฐ๋ ์คํ๋ง ์๋ฌธ, ๋ฐฑ๊ธฐ์ 
๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/spring_revised_edition/dashboard)

๊ธฐ๊ฐ: 2021.03

์กฐ๊ธ ๋ถ๋๋ฌ์ด ๊ฒฝํ์ธ๋ฐ ๊ฐ์๋ฅผ ๋ค์์ง๋ง ์ดํดํ ๋ด์ฉ์ ์ ๋ง ์๋ฌด๊ฒ๋ ์๋ค. IntelliJ๊ฐ ์ต์์น ์์ ๋จ์ถํค ์ฐพ์๋ณด๋๋ผ ๊ธ๊ธํ๋ค. ์คํ๋ง์ด ๋ฌด์์ธ์ง ์๊ณ  ์ถ์์ง๋ง ์คํ๋ ค ๋ ๋ชจ๋ฅด๊ฒ ๋๋ ์๊ฐ์ด์๋ค. Java์ ๊ธฐ๋ณธ์ ์ธ servlet ๊ตฌ์กฐ ์น ์ ํ๋ฆฌ์ผ์ด์ ์๋น์ค๊ฐ ์ด๋ป๊ฒ ์๋ํ๋์ง๋ ์ ๋ชจ๋ฅด๊ณ  ๋ค๋ณ๋ค๊ฐ ํธ๋๊ฒ ๋นํ๋ค.

- ์ฑ๊ธํ ๊ณต๋ถ๋ฅผ ์ค๋จํ๊ณ  ๋ค์ Java์ JSP ๊ณต๋ถ๋ฅผ ์ด์ด๊ฐ๋ค.



### [Inflearn] ์๋ฐ ํ๋ก๊ทธ๋๋ฐ ์๋ฌธ ๊ฐ์ข & ์ค์  JSP
๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/%EC%8B%A4%EC%A0%84-%EC%9E%90%EB%B0%94_java-renew/dashboard)

๊ธฐ๊ฐ: 2021.03

๊ตญ๋น๊ต์ก์ด ๋ง์น๊ณ  Backend์ ๊ด์ฌ์ ๊ฐ๊ณ  ์น ์๋น์ค ์ชฝ์ ๊ณต๋ถํ๊ธฐ๋ก ํ๋ค. ์ต์ข์ ์ผ๋ก๋ Spring์ ํ์ตํ๊ธฐ ์ํด ์๋ธ๋ฆฟ์ ๋จผ์  ํ์ตํ๋ค. ๊ทธ๋ฌ๋ค JSP์ Java์ ๋ณํํ์ฌ ๊ณต๋ถํ๊ณ ์ inflearn์์ ์ ๊ณต๋๋ ๊ฐ์๋ฅผ ์๊ฐํ๋ค.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_jsp


### [Inflearn_๊น์ํ] ์คํ๋ง ์๋ฌธ - ์ฝ๋๋ก ๋ฐฐ์ฐ๋ ์คํ๋ง ๋ถํธ, ์น MVC, DB ์ ๊ทผ ๊ธฐ์ 

๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8/dashboard)

๊ธฐ๊ฐ: 2021.04

์คํ๋ง์ ๋ํด ๋ณธ๊ฒฉ์ ์ธ ๊ณต๋ถ๊ฐ ์์๋๋ค. ๊น์ํ ๊ฐ์ฌ๋์ ์ค๋ช์ ํตํด ์คํ๋ง์ ์ ๋ฐ์ ์ผ๋ก ์ดํดํ  ์ ์์๊ณ  ๊ฐ๋ฒผ์ด ์์ ๋ฅผ ํตํด ์ฝ๋๋ฅผ ๊ตฌํํ์ฌ ๊ธฐ๋ฅ์ ๋ณด์ฌ์ฃผ์๋ค.

- SpringBoot๋ฅผ ํตํด ํ๋ก์ ํธ๋ฅผ ์์ฑํ๊ณ  MVC ํจํด, ํํ๋ฆฟ ํ์ต
- ์๊ตฌ์ฌํญ์ ํตํด ๋๋ฉ์ธ, ๋ ํฌ์งํ ๋ฆฌ, ์๋น์ค ์์ฑ
- ํ์คํธ ์ผ์ด์ค๋ฅผ ๋ง๋ค์ด๋ณด๋ ์ค์ต
- ์คํ๋ง ๋น์ ๋ํ ์ดํด์ ์น MVC ๊ฐ๋ฐ
- H2, JDBC, JPA๋ฅผ ํตํด DB์ ์ ๊ทผ

์๋ฌด๋๋ ์๋ฌธ ๊ฐ์๋ค ๋ณด๋ ๋ค๋ฃจ๋ ๋ด์ฉ์ด ๋ฐฉ๋ํ๊ณ  ์ ๋ฐ์ ์ธ ํ์ ์ก์์ฃผ๋ ๊ฐ์์๋ค. ๋น์์๋ ์ดํด๊ฐ ์๋๋๋ผ๋ ์ฐ์  ๊ตฌํ์ ํ๊ณ  ๋์ด๊ฐ ๋ค์์ ๊ฐ์๋ฅผ ์ ์ฒด ๋ฃ๊ณ ๋์ ๋์์ค๊ธฐ๋ก ํ๋ค.

(21.07.21) ์คํ๋ง ํต์ฌ์๋ฆฌ, MVC 1,2ํธ JPA 1ํธ์ ์๊ฐํ๋ค. ๋ค์ ์ด ๊ฐ์ ๋ชฉ์ฐจ๋ฅผ ๋ณด๋๋ฐ ์์ ๊ณผ๋ ํ์คํ ๋ฌ๋ผ์ก๋ค.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%EC%9E%85%EB%AC%B8/hello-spring



### [Inflearn_๊น์ํ] ์คํ๋ง ํต์ฌ ์๋ฆฌ - ๊ธฐ๋ณธํธ

๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard)

๊ธฐ๊ฐ: 2021.05 ~ 2021.06

์คํ๋ง์ ๊ฐ๋ ฅํ ๊ธฐ๋ฅ๋ค์ ์๊ฐํด์ฃผ๋ ๊ฐ์, ๊ฐ์ฒด ์งํฅ ํ๋ก๊ทธ๋๋ฐ์ ๋ํ ์ค๋ช๊ณผ 5๊ฐ์ง ์์น(SOLID)๋ฅผ ์ง์ผ์ผ ํ๋ ์ด์ ๋ฅผ ์์์ผ๋ก ์คํ๋ง์ ํ์์ฑ์ ๋ชธ์ ๋๋ผ๊ฒ ํด์ฃผ์๋ค.

- Java๋ฅผ ์ด์ฉํ์ฌ ์ฃผ๋ฌธํ๋ ์์ ๋ฅผ ํตํด ํ์, ์ฃผ๋ฌธ ๋๋ฉ์ธ๊ณผ ์๋น์ค๋ฅผ ๋ง๋ค์๋ค.
- ๋ณ๋์ฌํญ์ ํตํด ๊ธฐ์กด ์ฝ๋์ ๋ฌธ์ ์ ์ ์ ๊ธฐํ๊ณ  ๋ฆฌํฉํฐ๋งํ๋ ๊ณผ์ ์ ํตํด ๋ฌธ์ ์ํฉ์ ์ง์  ๋๋ฉดํ๊ณ  ํด๊ฒฐํ๋ค.
- ์คํ๋ง ์ปจํ์ด๋๋ฅผ ํตํด ๋ฌธ์ ๋ฅผ ํด๊ฒฐํ๊ณ  ์คํ๋ง ๋น์ ๋ํ ์ดํด
- ๋น์ ์ฑ๊ธํค ์ปจํ์ด๋๋ฅผ ์ดํด
- ์ปดํฌ๋ํธ ์ค์บ์ ํตํ ์์กด๊ด๊ณ ์๋ ์ฃผ์
- ๋น์ ์๋ช์ฃผ๊ธฐ๋ฅผ ์ดํด

๊ฐ์๋ฅผ ๋ค์ ์ ๋ฆฌํ๋ฉด์ ๋ค์ ๋ค์ด๋ด์ผ๊ฒ ๋ค๋ ์๊ฐ์ด ๊ฐํ๊ฒ ๋ ๋ค. JPA ๊ฐ์๋ฅผ ๋ง์  ๋ฃ๊ณ  ์ฒ์๋ถํฐ ๋ค์ ๋ค์ด๋ด์ผ๊ฒ ๋ค.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%EC%9B%90%EB%A6%AC

### [Inflearn_๊น์ํ] ๋ชจ๋  ๊ฐ๋ฐ์๋ฅผ ์ํ HTTP ์น ๊ธฐ๋ณธ ์ง์

๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/http-%EC%9B%B9-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/dashboard)

๊ธฐ๊ฐ: 2021.06

์น ์ ํ๋ฆฌ์ผ์ด์์ ๋ํด ํ์ตํ๊ธฐ ์ ์ HTTP๋ฅผ ๊ณต๋ถํ๋ค. ์ธํฐ๋ท ๋คํธ์ํฌ๊ฐ ์ด๋ค์ง๋ ๋ฐฉ์๋ถํฐ HTTP์ ๋ฉ์๋๋ฅผ ์ดํดํ๊ณ  ๊ฐ ๋ฉ์๋๊ฐ ๊ฐ์ง๋ ํน์ง๋ค์ ๊ณต๋ถํ๋ค.

- ์ธํฐ๋ท ๋คํธ์ํฌ (IP, TCP, UDP, PORT, DNS)
- HTTP์ ๊ตฌ์กฐ์ ๋ฉ์์ง ํํ
- ๊ฐ ๋ฉ์๋์ ํน์ง๋ค (GET, POST, PUT, PATCH, DELETE)
- HTTP ์ํ์ฝ๋


source:
https://github.com/Hyunta/Lessons/tree/master/CS/inflearn_%EB%AA%A8%EB%93%A0%20%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%A5%BC%20%EC%9C%84%ED%95%9C%20HTTP%20%EC%9B%B9%20%EA%B8%B0%EB%B3%B8%EC%A7%80%EC%8B%9D

### [Inflearn_๊น์ํ] ์คํ๋ง MVC 1ํธ - ๋ฐฑ์๋ ์น ๊ฐ๋ฐ ํต์ฌ ๊ธฐ์ 

๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1/dashboard)

๊ธฐ๊ฐ: 2021.06

์น ์ ํ๋ฆฌ์ผ์ด์์ ๋ํด ํ์ตํ๊ณ  ์๋ธ๋ฆฟ์ผ๋ก ๊ตฌํ์ ํ๋ค. HTTP Request, Response๋ฅผ ์ด๋ป๊ฒ ์ฒ๋ฆฌํด์ผํ๋์ง ๋ฐฉ๋ฒ์ ์ตํ๊ณ  ์ด๋ฅผ ์คํ๋ง์ ํตํด์ ์ฒ๋ฆฌํ๋ค.

- ์๋ธ๋ฆฟ๊ณผ JSP๋ฅผ ์ด์ฉํด MVC ํจํด์ ์ ์ฉํด๋ณด๊ณ  ๋ถํธํจ ํ์ธ
- MVC ํ๋ ์์ํฌ๋ฅผ ์ง์  ๋ง๋ค์ด ๋ณด์๋ค.
	- ๊ธฐ๋ณธ์ ์ธ ํ๋ก ํธ ์ปจํธ๋กค๋ฌ, view, model ์ ๊ตฌํํ๋ค.
- ์ด๋ฅผ ์คํ๋ง MVC ๊ตฌ์กฐ๋ก ๊ฐ์ ธ์ ์ดํดํ๋ค.
	- ํธ๋ค๋ฌ ๋งคํ๊ณผ, ๋ทฐ ๋ฆฌ์กธ๋ฒ์ ์ญํ ์ ํ์ธํ๋ค.
- ์คํ๋ง MVC์์ HTTP ์ฒ๋ฆฌํ๋ ๋ฐฉ๋ฒ์ ์ตํ๋ค.
- ์คํ๋ง MVC๋ฅผ ํตํด ์น ํ์ด์ง๋ฅผ ๋ง๋ค๋ฉฐ ๊ฐ ๊ธฐ๋ฅ์ ๊ตฌํํด๋ณธ๋ค.


source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%20%EC%9B%B9%20MVC1%262/spingmvc1

### [Inflearn_๊น์ํ] ์คํ๋ง MVC 2ํธ - ๋ฐฑ์๋ ์น ๊ฐ๋ฐ ํต์ฌ ๊ธฐ์ 

๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-2/dashboard)

๊ธฐ๊ฐ: 2021.07

1ํธ์์ ๋ฐฐ์ด ๊ธฐ๋ณธ์ ์ธ ํ ์ธ์ ๊ฐ๋ฐํ  ๋ ํ์ํ ํ์ฉ ๊ธฐ๋ฅ๋ค์ ํ์ตํ๋ค. ํ์๋ฆฌํ๋ฅผ ํตํด ํํ๋ฆฟ์ ๋ค๋ฃจ๊ณ , ๋ฉ์์ง๋ฅผ ์ด์ฉํด๋ณด๊ณ , Validation์ ํ๋ค. ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๋ ๋ฐฉ๋ฒ๊ณผ ์์ธ์ฒ๋ฆฌ ํ๋ ๋ฐฉ๋ฒ๋ค์ ๋ฐฐ์ ๋ค.

- ํ์๋ฆฌํ ๋ฌธ๋ฒ์ ํ์ตํ๊ณ  ๊ฐ ๊ธฐ๋ฅ๋ค์ ๊ตฌํํด๋ณธ๋ค.
- ๋ฉ์์ง ์์ค๋ฅผ ํตํด ๊ตญ์ ํ๋ ๊ตฌํํด๋ณด๊ณ  ํธ๋ฆฌํ๊ฒ ๊ด๋ฆฌํ๋ค.
- ๊ฒ์ฆํ๋ ๊ณผ์ ์ ์ง์  ๊ตฌํํ๋ฉฐ BindingResult์ ํ์์ฑ๊ณผ ๊ฐ erorr์ ์ถ๋ ฅํ๊ณ  ์ฒ๋ฆฌํ๋ ๊ณผ์ ์ ๊ตฌํํ๋ค.
- BeanValidation์ ํตํด ์คํ๋ง์ด ์ ๊ณตํ๋ ๊ธฐ๋ฅ์ ๊ตฌํํ๋ค.
- ๋ก๊ทธ์ธ ์ฒ๋ฆฌ ๋ฉ์ปค๋์ฆ์ ํ์ตํ๊ณ , ์ธ์์ ํตํด ํด๊ฒฐํ๋ค.
- ์๋ธ๋ฆฟ ํํฐ์ ์คํ๋ง ์ธํฐ์ํฐ๋ก ์ธ์ฆ๊ณผ์ ์ ๊ตฌํํ๋ค.
- ์์ธ ์ฒ๋ฆฌ ํ์ด์ง๋ฅผ ์ฒ๋ฆฌํ๋ ๋ฐฉ๋ฒ์ ๋ณด๊ณ  Spring์ด ์ ๊ณตํ๋ ๊ธฐ๋ฅ์ ๊ตฌํํ๋ค.


source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8A%A4%ED%94%84%EB%A7%81%20%EC%9B%B9%20MVC1%262/springmvc2

### [Inflearn_๊น์ํ] ์ค์ ! ์คํ๋ง ๋ถํธ์ JPA ํ์ฉ1 - ์น ์ ํ๋ฆฌ์ผ์ด์ ๊ฐ๋ฐ

๐บ[๊ฐ์ ์๊ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1/dashboard)

๊ธฐ๊ฐ: 2021.07

ํ๋ก์ ํธ๋ฅผ ์ง์  ์งํํ๋ฉฐ JPA์ ์ธ๋ชจ๋ฅผ ๋๋๋ค. ๊ธฐ๋ณธ์ ์ธ ์คํ๋ง MVC์ DB์ ๊ทผ๊น์ง ๋ํด์ง ํ๋ก์ ํธ์ด๋ค. ์ํฐํฐ ํด๋์ค๋ฅผ ๋ง๋ค๋ฉด์ DB ์ค๊ณ ๋ฐ ๊ด๋ฆฌ์ ์ค์์ฑ์ ๊นจ๋ฌ์๋ค.

- ํ์ ๊ด๋ฆฌ, ์ํ ๊ด๋ฆฌ, ์ฃผ๋ฌธ ๊ด๋ฆฌ ์ธ ํํธ๋ก ๋๋์ด์ง๋ค.
- ๊ฐ ๋๋ฉ์ธ, ๋ฆฌํฌ์งํ ๋ฆฌ, ์๋น์ค๋ฅผ ๊ฐ๋ฐํ๊ณ  ๊ธฐ๋ฅ์ ๊ฐ๋ฐํ๋ค.
- ์ํฐํฐ ์ค๊ณ์ ์ค์์ฑ๊ณผ ๋๋ฉ์ธ ์ฃผ๋ ์ค๊ณ(DDD)๋ฅผ ํ์ต.

source:
https://github.com/Hyunta/Lessons/tree/master/Java/inflearn_%EC%8B%A4%EC%A0%84!%20%EC%8A%A4%ED%94%84%EB%A7%81%20%EB%B6%80%ED%8A%B8%EC%99%80%20JPA%20%ED%99%9C%EC%9A%A91





## ๐โโ๏ธPersonal Experience
### [์กฐ์ฝ๋ฉ] ํ์ด์ฌ ์ฃผ์ ํฌ์ ์๋ํ
๐บ[Youtube ์์](https://youtu.be/5bTxyBeOVkA)

๊ธฐ๊ฐ: 2021.01

Django๋ฅผ ์ฌ์ฉํ๋ฉฐ Python์ ์ต์ํด์ง๊ณ  ํ์ค ๋ฌธ์ ๋ฅผ ํด๊ฒฐํด๋ณด๊ณ  ์ถ์๋ค. ์ฃผ์ ๊ฐ๊ฒฉ์ด ์ค๋ฅด๊ณ  ๋ด๋ฆฌ๋ ๊ฒ์ ์ผ์ ํ ๊ท์น์ด ์๋ ๊ฒ ๊ฐ์์ ์๋ ์ฃผ๋ฌธํ๋ ์์คํ์ ๋ง๋ค์ด ๋ณด์๋ค. ๋ด๊ฐ ์ํ๋ ๋ฐฉ์์ผ๋ก ๊ตฌํํ๋ ๊ณผ์ ์ ์์ธ์ฒ๋ฆฌํ๋๋ผ ๊ณ ์ํ๋ค.

- CREON Open API๋ฅผ ์ด์ฉํ์ฌ ๋์ ์ฆ๊ถ ์ฃผ์ ์ ๋ณด๋ฅผ ํ์ฉ
- Slack API๋ฅผ ์ด์ฉํ์ฌ ์๋์ผ๋ก ์๋ฆผ์ ์ฃผ๋ ๋ด์ ๋ง๋ฌ
- ์๋์ฐ ์์ ์ค์ผ์ฅด๋ฌ๋ก ์ ํด์ง ์๊ฐ์ ์๋์ผ๋ก ์คํํ๋๋ก ๊ตฌํ

source:
https://github.com/Hyunta/Lessons/tree/master/Python/jocoding_auto_stock

### [๊ฐ์ธ]Dacon ๋ํ ๊ณผ์  ์๋ฒ ๊ตฌ์ถํ๊ธฐ

๊ธฐ๊ฐ: 2021.03

๊ตญ๋น๊ต์ก ์ต์ข ํ๋ก์ ํธ๋ก Dacon ์ฐธ๊ฐ๋ฅผ ๋ง์น๊ณ  ์ด๋ฅผ ์๋ฒ์๋ค ์ฌ๋ ค๋ณด๊ณ  ์ถ์๋ค. Linux OS์ Apache ์๋ฒ๋ฅผ ์ด๊ณ  ๊ฐ๋จํ๊ฒ HTML ํ์ด์ง๋ฅผ ๊ตฌ์ฑํ์ฌ ๋ง๋ค์๋ค.

- AWS EC2 ์ธ์คํด์ค๋ฅผ ์์ฑํ์ฌ ubuntu ์๋ฒ๋ฅผ ๋ง๋ค๊ณ  apache๋ฅผ ์คํํ๋ค.
- Windows OS์์ Linux๋ก Html ํ์ผ์ ์ ์กํ๋๋ฐ WinSCP๋ฅผ ์ด์ฉํ์ฌ ์ ์กํ๋ค.
- nginx์ apache์ ๋ํ ๊ณต๋ถ๋ฅผ ํ๊ณ  ์์ฐ์ค๋ฝ๊ฒ ํ๋ก์ธ์ค์ ์ฐ๋ ๋๋ฅผ ์ตํ๋ค.

source:
https://github.com/Hyunta/sea_ice_prediction

### [Programmers] ํ๋ก๊ทธ๋๋จธ์ค ์๊ฐ ์ฝ๋ ์ฑ๋ฆฐ์ง ์์ฆ2
[๋ํ ์๋ด](https://programmers.co.kr/competitions/1078/monthly-code-challenge-s2)

๊ธฐ๊ฐ: 2021.03 ~ 2021.05

์ฝ๋ฉํ์คํธ๋ฅผ ํ์ฐฝ ๊ณต๋ถํ  ๋ ๋ด ์์ค์ ์๊ณ  ์ถ์ด์ ์ฐธ๊ฐํ๋ค.
4์: 4๋ฌธ์  ์ค 2.5๋ฌธ์ ๋ฅผ ํ์ด์ ๋ง์กฑ์ค๋ฌ์ด ๊ฒฐ๊ณผ๋ฅผ ๋๋ค.
5์์๋ ์ผ์ ์ด ๊ฒน์ณ์ ์์ฝ๊ฒ ์ฐธ๊ฐํ์ง ๋ชปํ๋ค.
![](https://images.velog.io/images/mohai2618/post/b2ca4350-0ba3-4d37-a653-9b977ffa8590/image.png)


### [NAVER] CLOVA AI RUSH 2021
[๋ํ ์๋ด](https://campaign.naver.com/clova_airush/)

๊ธฐ๊ฐ: 2021.04~2021.06

Dacon ๋ํ ์ข๋ฃ ํ DeepLearning์ ์กฐ๊ธ ๋ ๊ณต๋ถํด๋ณด๊ณ ์ ์ฐธ๊ฐํ๋ค. ์ฝ๋ฉํ์คํธ๋ฅผ ํฉ๊ฒฉํ์ฌ 1๋ผ์ด๋์ ์ง์ถํ  ๊ธฐํ๊ฐ ์ฃผ์ด์ก๋ค.

5๊ฐ์ง ์ฃผ์ ๊ฐ ์์๋๋ฐ ๋ด๊ฐ ๋งก์์ ํด๊ฒฐํ๊ณ ์ ํ๋ ๋ฌธ์ ๋ ์ค์๊ฐ ๋ฒ์ค ๋์ฐฉ ์์ ์๊ฐ ์์ธก ์ ํ๋ ํฅ์ ๋ฌธ์ ์๋ค.

ํ๊ณ์ : Tensorflow ๋ฐ์ ์ฌ์ฉํด๋ณด์ง ์์๊ณ  ๊ฒฝํ์ด ๋ณ๋ก ์๋ค๋ณด๋ Pytorch๋ฅผ ๋ค๋ฃจ๋๋ฐ ๋ฒ๊ฑฐ์ ๋ค. ๋ชจ๋  ๊ณผ์ ์ ๊ณต๋ถํ์ด์ผ ํ๊ณ  ๊ทธ๋ฌ๋ค๋ณด๋ ๋ณธ์ง์ ์ธ ๋ชจ๋ธ์ ๋ํ ๊ณ ๋ฏผ๋ณด๋ค๋ ํด์ ๋ํ ๊ณต๋ถ๊ฐ ๋ง์์ ธ์ 2๋ผ์ด๋ ์ง์ถ์ ๋ชปํ๊ฒ ๋์๋ค.

๊ฐ์ธ์ ์ผ๋ก ์์ฌ์์ด ๋ง์ด ๋จ๋๋ค, ์ด ๋น์ Spring์ ๊ณต๋ถํ๊ณ  ์์๊ณ  Data Science์ ๋๋ฌด ์๊ฐ์ ์์ ์ ์์ด์ ๊ฒฐ๊ณผ๊ฐ ๋ง์กฑ์ค๋ฝ์ง ๋ชปํ์ง๋ง ์ถํ์ ๋ ๊ณต๋ถํด๋ณด๊ณ  ์ถ์ ์์ฌ์ ์๋ค.





โ    