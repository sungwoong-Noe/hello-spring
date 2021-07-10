package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>(); //저장하는 메모리 Long 타입, Member는 값
    private static long sequence = 0L; //sequence : 0, 1, 2 ... 키 값을 생성해주는 것


    @Override
    public Member save(Member member) {
        member.setId(++sequence); //저장소에 저장되는 회원 아이디 하나씩 증가 시킴
        store.put(member.getId(), member); //스토어에 저장
        return member; //저장된 결과 반환
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); //아이디가 없으면 null이 반환되므로 Optional.ofNullable로 감싸
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream() //람다를 사용하여 루프를 돌림
                .filter(member -> member.getName().equals(name)) //getName이 넘어온 name이랑 같은지 확인 같은 경우만 필터링
                .findAny(); //그냥 찾으면 반환 끝까지 없으면 Optional에 null이 포함되어 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); //store에 멤버들을 리스트로 만들어 반환
    }
}
