package kr.co.suncompany.son;

import kr.co.suncompany.son.entity.Member;
import kr.co.suncompany.son.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberService memberService;

    @PostConstruct
    public void init() {
        Member member1 = new Member("홍길동", "hong@test.com");
        Member member2 = new Member("김철수", "kim@test.com");
        
        memberService.join(member1);
        memberService.join(member2);
    }
} 