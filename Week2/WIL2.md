### HTTP

HyperText Transfer Protocol의 약자로 웹에서 TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송하는 application 계층의 프로토콜

- 특징: 비연결성, 무상태성
- HTTP 상태 코드
    - 1xx (information): 요청이 수신되어 처리 중
    - 2xx (Successful): 요청 정상 처리
    - 3xx (Redirection): 요청 완료하려면 추가 행동 필요
    - 4xx (Client Error): 클라이언트 오류, 잘못된 문법 등으로 서버가 요청을 수행할 수 없음
    - 5xx (Server Error): 서버 오류, 서버가 정상 요청을 처리하지 못함

  자주 사용하는 상태코드
    - 200: 클라이언트의 요청을 정상적으로 수행
    - 201: 클라이언트가 생성 요청한 리소스가 성공적으로 생성(POST 이용 시)
    - 204: 클라이언트가 삭제 요청한 리소스가 성공적으로 삭제
    - 400: 클라이언트의 요청 부적절
    - 401: 클라이언트가 인증되지 않은상태에서 보호된 리소스 요청
    - 403: 응답하고 싶지 않은 리소스를 클라이언트가 요청
    - 404: 클라이언트가 요청한 리소스에서는 사용 불가능한 method를 이용
    - 500: 서버에 문제
    - 502: 게이트웨이 오류

### HTTPS

- HTTP 문제점: 서버에서 브라우저로 전송되는 정보가 암호화되지 않음 →  데이터가 쉽게 도난당할 수 있음

  → HTTPS는 SSL을 사용함으로서 문제 해결

- SSL
    - HTTP와 HTTPS의 차이점 → HTTPS: HTTP + 보안 기능
    - 서버와 브라우저 사이에 안전하게 암호화된 연결을 만들고, 서버 브라우저가 민감한 정보를 주고 받을 때 이것을 도난당하지 않도록 도와줌
    - SSL 인증서: 사용자가 사이트에 제공하는 정보 암호화 (데이터 -> 암호)

### RESTful한 API URL 설계


이벤트 목록 조회 GET /events

이벤트 조회 GET /events/{id}

이벤트 등록 POST /events

이벤트 수정 PATCH /events/{id}

이벤트 삭제 DELETE /events/{id}

이벤트 상태 변경 PATCH /events/{id}/status

특정 이벤트의 주문 목록 조회 GET /events/{id}/orders

멤버 목록 조회 GET /members

특정 멤버 권한 변경 PATCH members/{id}/role

특정 멤버 정보 조회 GET /members/{id}

특정 멤버 정보 변경 PATCH /members/{id}

멤버 등록 POST /members
