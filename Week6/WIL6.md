## ORM (Object-Relational Mapping)

- Entitiy: 데이터베이스에 넣을 객체

    ```java
    @Entity
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public class Member {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        @OneToMany(fetch = FetchType.LAZY)
        private List<Feed> feeds;
    
        private String name;
    }
    ```

- ORM
    - 데이터베이스와 객체 지향 프로그래밍 언어 사이의 관계형 데이터를 객체로 매핑하는 기술이나 프로그래밍 기술
    - 위 객체를 데이터베이스의 데이터 형식으로 바꿔 저장해주는 역할

## JPA (Java Persistence API)

- 주로 스프링에서 많이 사용하지만, 자바 애플리케이션에서 관계형 데이터베이스를 사용하는 방법을 정의한 자바 API
- 자바 ORM 기술에 대한 표준 사양으로, 객체와 데이터베이스 테이블 간의 매핑을 처리

## Mapping

### 1 : 1

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/9446916b-235b-4ce0-8b6e-c428b11a7de8/bb35c770-c8b3-4ec7-8341-857b90a49b1c/Untitled.png)

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Wife wife;

		private String name;
}
```

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Husband husband;

		private String name;
}
```

- 양방향 접근 필요 없을 경우

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/9446916b-235b-4ce0-8b6e-c428b11a7de8/f8a0fef6-72af-4196-89b9-77cee1910048/Untitled.png)

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

		private String name;
}
```

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Husband husband;

		private String name;
}
```

### 1 : N

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/9446916b-235b-4ce0-8b6e-c428b11a7de8/2280dab9-c069-4646-a0a5-320252762390/Untitled.png)

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Employee> employees;

    private String name;
}
```

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Department department;

    private String name;
}
```

### N : M

- 연결 테이블만 존재: 실무에서 사용하면 X → 추가 정보를 넣는 것이 불가능
- 해결책: 연결 테이블용 엔티티 추가

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/9446916b-235b-4ce0-8b6e-c428b11a7de8/97fbc5f9-fea3-45ae-a63a-6a648ca8b81f/Untitled.png)

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;
}
```

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Order> orders;

    private String name;
}
```

```java
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Order> orders;

    private String name;
}
```