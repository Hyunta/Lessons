# URI (Uniform Resource Identifier)

- Uniform : 리소스 식별하는 통일된 방식
- Resource : 자원, URI로 식별할 수 있는 모든 것 ( 제한 없음 )
- Identifier : 다른 항목과 구분하는데 필요한 정보



URL - Locator : 리소스가 있는 위치 지정

URN - Name : 리소스에 이름을 부여



### URL 전체 문법

` scheme://[userinfo@]host[:port][/path][?query][#fragment]`

##### scheme

주로 프로토콜 사용 ex) http, https, ftp 등

##### userinfo

거의 사용하지 않음

##### Host

호스트명

##### Port

생략 가능 , http : 80 , https : 443

##### Path

리소스 경로, 계층적 구조

##### query

key =  value 형태

?로 시작, &로 추가 가능 ?keyA = valueA&keyB=valueB

query parameter, query string 등으로 불림 , 웹서버에서 제공하는 파라미터, 문자형태

##### fragment

html 내부 북마크에서 사용



## 웹브라우저의 요청 흐름

HTTP 요청 메시지를 생성

` GET /search?q=hello&hl=ko HTTP/1.1 Host: www.google.com`

![image-20210614144639272](C:\Users\mohai\AppData\Roaming\Typora\typora-user-images\image-20210614144639272.png)



