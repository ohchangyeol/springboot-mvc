package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// ORM -> 객체와 관계형 데이터베이스의 데이터를 자동으로 매핑 해주는 것을 말한다.
@Entity
public class Member {
    @Id
    // 시퀀스같은 자동생성해주는 역활 -> identity 패턴
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
