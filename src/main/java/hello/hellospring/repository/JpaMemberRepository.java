package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(em.find(Member.class, id));
    }


    @Override
    public List<Member> findAll() {
         /*
         Java Persistence Query Language (JPQL)
         객체지향 쿼리 -> 테이블 대상이 아닌 객체 대상으로 잡은 쿼리

         테이블에 맞게 퀴리 작성      "SELECT id, name FROM MEMBER m"
         객체에 맞게 쿼리 작성        "SELECT m FROM Member m"

         테이블에 맞게 작성을 한다면 하나하나 매핑을 해야하는 반면 JPQL 같은 경우 객체자체를 select해 ORM이 적용된 기술이다.
         */
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    @Override
    public Optional<Member> findByName(String name) {
        /*
        Java Persistence Query Language (JPQL)
        parameter같은 경우 :변수명 작성후 setParameter로 작성.
        */

        List<Member> result = em.createQuery("select m from Member m where m.name - :name", Member.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();

    }


}
