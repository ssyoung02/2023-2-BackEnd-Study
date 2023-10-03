### Spring Bean

- 스프링 IoC 컨테이너에 의해 관리되는 자바 객체로 의존성 문제를 더 쉽게 해결할 수 있도록 해줌
- 스프링 IoC 컨테이너: 빈을 관리하는 객체로 ApplicationContext라는 인터페이스가 대표함
- ApplicationContext: 여러 인터페이스를 상속받아 만들어지며 빈 조회, 이벤트 발행, 환경변수 조회 등 다양한 기능 구현할 수 있음

### Spring Bean 등록 방법

1. @Configuration 어노테이션 이용하여 싱글톤으로 관리
- ApplicationContext의 구현체인 AnnotationConfigApplicationContext에 파라미터로 넘긴 값을 스프링 빈으로 등록
- 위 코드에서 AppConfig를 파라미터로 넘겼으므로 AppConfig와 해당 파일에 빈으로 등록한 것들이 스프링 빈으로 등록
- @Configuration 어노테이션을 사용하면 스프링이 바이트 코드를 조작해 싱글톤이 보장할 수 있게 다른 객체를 생성해서 저장

→ 빈을 싱글톤으로 생성하기 위해 @Configuration 어노테이션을 사용한 객체를 ApplicationContext의 파라미터로 넘기면 됨
→ 너무 번거로움

2**Componenet Scan**
- @Componenet Scan 사용: @Componenet Scan, @Componenet 어노테이션 이용하면 됨
    - @Componenet
        - 스프링 빈으로 등록하려는 클래스에 붙일 수 있는 어노테이션
        - 스프링은 이 어노티에션의 붙은 클래스 자동으로 검색하고 빈으로 등록