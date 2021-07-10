package hello.hellospring.domain;

public class Member {

    //두 가지 요구사항
    private Long id; //시스템이 저장하는 아이디, 고객이 정하는 아이디 아님
    private String name; //이름

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
