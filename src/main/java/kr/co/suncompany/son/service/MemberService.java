package kr.co.suncompany.son.service;

import kr.co.suncompany.son.entity.Member;
import kr.co.suncompany.son.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;
    
    @Transactional
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }
    
    private void validateDuplicateMember(Member member) {
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if (findMember != null) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
    
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
    
    public List<Member> searchMembers(String name) {
        return memberRepository.findByNameContaining(name);
    }
}