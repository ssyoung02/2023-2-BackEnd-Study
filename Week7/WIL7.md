Spring Data JPA가 제공하는 DB에 관한 작업을 하는 방법
1. JpaRepository
2. Query Method
3. Custom Query

### JpaRepository

- findAll()

테이블에서 레코드 전체 목록을 조회

- findById(id)

  테이블에서 기본키 필드 값이 id인 레코드를 조회

- save(Entity entity)

  entity 객체를 entity 테이블에 저장

  객체의 id(기본키) 속성값이 0이면 INSERT / 0이 아니면 UPDATE

- saveAll(List)

  객체 목록을 테이블에 저장

- delete(객체)

  객체의 id(기본키) 속성값과 일치하는 레코드를 삭제

- deleteAll(List)

  객체 목록을 테이블에서 삭제

- count()

  테이블의 전체 레코드 수를 리턴

- exists(id)

  테이블에서 id에 해당하는 레코드가 있는지 true/false 리턴


### ****Query Method****

- find, update, delete 뒤에 조건을 붙임 (ex) find + by 조건)
- query method 필터 조건

| Keyword | Sample | JPQL snippet |
| --- | --- | --- |
| Distinct | findDistinctByLastnameAndFirstname | select distinct …​ where x.lastname = ?1 and x.firstname = ?2 |
| And | findByLastnameAndFirstname | … where x.lastname = ?1 and x.firstname = ?2 |
| Or | findByLastnameOrFirstname | … where x.lastname = ?1 or x.firstname = ?2 |
| Is, Equals | findByFirstname,findByFirstnameIs,findByFirstnameEquals | … where x.firstname = ?1 |
| Between | findByStartDateBetween | … where x.startDate between ?1 and ?2 |
| LessThan | findByAgeLessThan | … where x.age < ?1 |
| LessThanEqual | findByAgeLessThanEqual | … where x.age <= ?1 |
| GreaterThan | findByAgeGreaterThan | … where x.age > ?1 |
| GreaterThanEqual | findByAgeGreaterThanEqual | … where x.age >= ?1 |
| After | findByStartDateAfter | … where x.startDate > ?1 |
| Before | findByStartDateBefore | … where x.startDate < ?1 |
| IsNull, Null | findByAge(Is)Null | … where x.age is null |
| IsNotNull, NotNull | findByAge(Is)NotNull | … where x.age not null |
| Like | findByFirstnameLike | … where x.firstname like ?1 |
| NotLike | findByFirstnameNotLike | … where x.firstname not like ?1 |
| StartingWith | findByFirstnameStartingWith | … where x.firstname like ?1 (parameter bound with appended %) |
| EndingWith | findByFirstnameEndingWith | … where x.firstname like ?1 (parameter bound with prepended %) |
| Containing | findByFirstnameContaining | … where x.firstname like ?1 (parameter bound wrapped in %) |
| OrderBy | findByAgeOrderByLastnameDesc | … where x.age = ?1 order by x.lastname desc |
| Not | findByLastnameNot | … where x.lastname <> ?1 |
| In | findByAgeIn(Collection ages) | … where x.age in ?1 |
| NotIn | findByAgeNotIn(Collection ages) | … where x.age not in ?1 |
| True | findByActiveTrue() | … where x.active = true |
| False | findByActiveFalse() | … where x.active = false |
| IgnoreCase | findByFirstnameIgnoreCase | … where UPPER(x.firstname) = UPPER(?1) |

### ****Custom Query****

- 위의 두 기능으로 구현 힘들 때 사용(@Query) 사용

  → JPQL/SQL(native query)을 통해 쿼리 작성