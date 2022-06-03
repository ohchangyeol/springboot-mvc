# Spring Boot - MVC
김영한 개발자님의 인프런 강의입니다.  
[스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8)

## 스프링 DB 접근 기술

- 순수 JDBC  
  DataSource를 이용해 커넥션 풀을 홯용한 DB 접근
- 스프링 통합 테스트
- 스프링 JdbcTemplate  
  반복되는 코드가 줄어들지만 직접 Query를 작성해 DB 접근
- JPA  
  기본 CRUD같은 경우 쿼리를 작성하지않음. select 할때 JPQL을 이용해 작성 가능.
- 스프링 데이터 JPA  
  구현클래스를 작성할 필요 없이 인터페이스의 메소드 명으로만으로도 DB 접근 가능