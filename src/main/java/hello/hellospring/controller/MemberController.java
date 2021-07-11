package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired // Autowired를 쓰면 스프링 컨테이너에서 멤버 서비스를 가져옴
    public MemberController(MemberService memberService) { // 생성자
        this.memberService = memberService;
    }
}

