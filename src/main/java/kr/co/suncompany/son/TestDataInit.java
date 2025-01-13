package kr.co.suncompany.son;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import kr.co.suncompany.son.entity.Member;
import kr.co.suncompany.son.service.MemberService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberService memberService;

    @PostConstruct
    public void init() {
        Member member1 = Member.builder()
                            .name("김기준")
                            .email("kijoon22@gmail.com")
                            .address("인천시 서구")
                        .build();
        Member member2 = Member.builder()
                            .name("오범석")
                            .email("lawsnland@gmail.com")
                        .build();
        
        memberService.join(member1);
        memberService.join(member2);
    }
} 