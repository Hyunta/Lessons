# HTTP 헤더

#### 용도

- HTTP 전송에 필요한 모든 부가 정보
  - ex) 메시지 바디의 내용, 메시지 바디의 크기, 압축, 인증, 요청 클라이언트, 서버 정보, 캐시 관리 정보...
- 표준 헤더가 너무 많음
- 필요시 임의의 헤더 추가 가능



## RFC 723x 변화

- 메시지 본문을 통해 표현 데이터 전달
- 메시지 본문 = payload
- 표현은 요청이나 응답에서 전달할 실제 데이터
- 표현 헤더는 표현 데이터를 해석할 수 있는 정보 제공
  - 데이터 유형, 데이터 길이, 압축 정보 등등
- 참고 : 표현 헤더는 표현 메타 데이터와 페이로드 메시지를 구분해야하지만, 여기서는 생략



## 표현

• Content-Type: 표현 데이터의 형식 

• Content-Encoding: 표현 데이터의 압축 방식 

• Content-Language: 표현 데이터의 자연 언어 

• Content-Length: 표현 데이터의 길이



### Content-Type

- 미디어 타입, 문자 인코딩
  - ex)
  - text/html; charset = utf-8
  - application/json
  - image/png



### Content-Encoding

- 표현 데이터를 압축하기 위해 사용
- 데이터를 전달하는 곳에서 압축 후 인코딩 헤더 추가
- 데이터를 읽는 쪽에서 인코딩 헤더의 정보로 압축 해제



### Content-Language

- 표현 데이터의 자연 언어를 표현



### Content-Length

- 바이트 단위
- Transfer-Encoding(전송코딩)을 사용하면 Content-Length를 사용하면 안됨



## 협상(Content Negotiation)

클라이언트가 선호하는 표현 요청



- Accept: 클라이언트가 선호하는 미디어 타입 전달
- Accept-Charset: 클라이언트가 선호하는 문자 인코딩
- Accept-Encoding: 클라이언트가 선호하는 압축 인코딩
- Accepet-Language: 클라이언트가 선호하는 자연 언어

협상 헤더는 요청시에만 사용



### 협상과 우선순위

1. Quality Values

- Quality Values(q) 값 사용
- 0~1, 클수록 높은 우선순위
- 생략하면 1
- Accept-Language: ko-KR, ko;q=0.9,en-US;q=0.8,en;q=0.7



2. 구체적인 것이 우선이다

- Accept: text/*, text/plain, text/plain;format=flowed, */*



3. 구체적인 것을 기준으로 미디어 타입을 맞춘다.



## 전송 방식

- 단순 전송
- 압축 전송
- 분할 전송
- 범위 전송



## 일반 정보 

### From

유저 에이전트의 이메일 정보

- 일반적으로 잘 사용되지 않음
- 요청에서 사용



### Referer

이전 웹 페이지 주소

- 현재 요청된 페이지의 이전 웹 페이지 주소
- A -> B 로 이동하는 경우 B를 요청할 떄 Referer: A 를 포함해서 요청
- Referer를 사용해서 유입 경로 분석 가능
- 요청에서 사용



### User-Agent

유저 에이전트 애플리케이션 정보

- user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/ 537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36
- 클라이언트의 애플리케이션 정보 (웹 브라우저 정보, 등등)
- 통계 정보
- 어떤 종류의 브라우저에서 장애가 발생하는지 파악 가능
- 요청에서 사용



### Server

요청을 처리하는 ORIGIN 서버의 소프트웨어 정보

- Server: Apache/2.2.22 (Debian)
- server:nginx
- 응답에서 사용



### Date

메시지가 발생한 날짜와 시간

- 응답에서 사용



## 특별한 정보



### Host

요청한 호스트 정보(도메인)

- 요청에서 사용
- 필수
- 하나의 서버가 여러 도메인을 처리해야 할 때
- 하나의 IP 주소에 여러 도메인이 적용되어 있을 때



### Location

페이지 리다이렉션

- 웹 브라우저는 3xx 응답의 결과에 Location에 헤더가 있으면, 리다이렉트



### Allow

허용 가능한 HTTP 메서드

- 405(Method Not Allowed) 에서 응답에 포함해야함
- Allow : GET, HEAD, PUT



### Retry-After

유저 에이전트가 다음 요청을 하기까지 기다려야 하는 시간



## 인증

- Authorization: 클라이언트의 인증 정보를 서버에 전달
- WWW-Authenticate: 리소스 접근시 필요한 인증 방법 정의



## 쿠키

- Set-Cookie: 서버에서 클라이언트로 쿠키 전달(응답)
- Cookie: 클라이언트가 서버에서 받은 쿠키를 저장하고, HTTP 요청시 서버로 전달



- 사용처
  - 사용자 로그인 세션 관리
  - 광고 정보 트래킹
- 쿠키 정보는 항상 서버에 전송됨
  - 네트워크 트래픽 추가 유발
  - 최소한의 정보만 사용 (세션 id, 인증 토큰)
  - 서버에 전송하지 않고, 웹 브라우저 내부에 데이터를 저장하고 싶으면 웹스토리지 참고
- 주의! : 보안에 민감한 데이터는 저장하면 안됨(주민번호, 신용카드 번호 등)



### 생명주기

- Set-Cookie: expires=Sat, 26-Dec-2020 04:39:21 GMT
- Set-Cookie: max-age=3600 (3600초)



### 도메인

- 명시: 명시한 문서 기준 도메인 + 서브 도메인 포함
  - domain = example.org를 지정해서 쿠키 생성
    - example.org는 물론이고
    - dev.example.org도 쿠키 접근
- 생략시 현재 문서 기준 도메인만 적용



### 경로

정해진 경로를 포함한 하위 경로 페이지만 쿠키 접근

일반적으로  path=/루트로 지정

ex) path=/home 지정



### 보안

Secure, HttpOnly, SameSite

- Secure
  - 쿠키는 http,https를 구분하지 않고 전송
  - Secure을 적용하면 https인 경우에만 전송
- HttpOnly
  - 자바스크립트에서 접근 불가
  - Http 전송에만 사용
- SameSite
  - XSRF 공격 방지
  - 요청 도메인과 쿠키에 설정된 도메인이 같은 경우만 쿠키 전송

