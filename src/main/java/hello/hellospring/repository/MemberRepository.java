package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    //Repository : 저장소

    Member save(Member member); //save: 저장소에 회원 저장
    Optional<Member> findById(Long id); //아이디로 회원을 찾는 것
    Optional<Member> findByName(String id); //Optional: null을 처리하는 방법
    List<Member> findAll(); //저장소에 모든 회원 반환해줌

}
