# HTTP 헤더2 : 캐시와 조건부 요청

## 캐시 기본 동작

### 캐시가 없을 때

- 데이터가 변경되지 않아도 다운로드 해야함
- 인터넷 네트워크는 매우 느리고 비싸다.
- 느린 사용자 경험



### 캐시 적용

- 네트워크 불필요
- 비싼 네트워크 사용량을 줄일 수 있다.
- 빠른 사용자 경험



### 캐시 시간 초과

- 만료가 되어있으면 다시 네트워크 다운로드가 발생한다.



## 검증 헤더와 조건부 요청1

- 캐시 유효 시간이 초과해도, 서버의 데이터가 갱신되지 않으면
- 304 Not Modified + 헤더 메타 정보만 응답 (바디X)
- 클라이언트는 서버가 보낸 응답 헤더 정보로 캐시의 메타 정보를 갱신
- 클라이언트는 캐시에 저장되어 있는 데이터 재활용
- 결과적으로 네트워크 다운로드가 발생하지만 용량이 적은 헤더 정보만 다운로드
- 매우 실용적인 해결책



## 검증 헤더와 조건부 요청 2

검증 헤더:

- 캐시 데이터와 서버 데이터가 같은지 검증하는 데이터
  - Last-Modified, Etag
- 조건부 요청 헤더
  - 검증 헤더로 조건에 따른 분기
  - If-Modified-Since:Last Modified 사용
  - If-None-Match:Etag 사용
  - 조건이 만족하면 200 OK
  - 조건이 만족하지 않으면 304 Not Modified



### ETag(Entity Tag)

캐시용 데이터에 임의의 고유한 버전을 달아둠

- 예) ETag: "v1.0"

데이터가 변경되면 이름을 바꾸어서 변경함 (Hash를 다시 생성)

단순하게 Etag만 보내서 같으면 유지 다르면 다시 받기



## 캐시와 조건부 요청 헤더

### Cache-Control (캐시 지시어)

- Cache-Contol: max-age
  - 캐시 유효시간, 초 단위
- Cache-Contol: no-cache
  - 데이터는 캐시해도 되지만, 항상 원(origin) 서버에 검증하고 사용
- Cache-Contol: no-store
  - 데이터에 민감한 정보가 있으므로 저장하면 안됨
  - 메모리에서 사용하고 최대한 빨리 삭제



### Pragma (캐시 제어, 하위 호환)



### Expires(캐시 만료일 지정, 하위 호환)

캐시 만료일을 정확한 날짜로 지정

지금은 더 유연한 Cache-Contol: max-age 권장

같이 사용되면 Expires 무시



## 프록시 캐시

![image-20210616162348345](C:\Users\mohai\AppData\Roaming\Typora\typora-user-images\image-20210616162348345.png)



### Cache-Cotrol

- Cache-Cotrol: public
  - 응답이 public 캐시에 저장되어도 됨
- Cache-Cotrol: private
  - 응답이 해당 사용자만을 위한 것임, private 캐시에 저장해야함(default)
- Cache-Cotrol: s-maxage
  - 프록시 캐시에만 적용되는 max-age
- Age: 60 (HTTP 헤더)
  - 오리진 서버에서 응답 후 프록시 캐시 내에 머문 시간(초)



## 캐시 무효화

확실한 캐시 무효화 응답

- Cache-Control: no-cache, no-store, must-revalidate
- Pragma: no-cache

must-revalidate - 원서버에 접속이 안될경우, 항상 오류가 발생해야함