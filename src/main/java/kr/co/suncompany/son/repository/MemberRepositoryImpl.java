package kr.co.suncompany.son.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.suncompany.son.entity.Member;
import kr.co.suncompany.son.entity.QMember;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory queryFactory;
    
    @Override
    public List<Member> findByNameContaining(String name) {
        QMember member = QMember.member;
        
        return queryFactory
                .selectFrom(member)
                .where(member.name.contains(name))
                .fetch();
    }
    
    @Override
    public List<Member> findByEmailAndName(String email, String name) {
        QMember member = QMember.member;
        
        return queryFactory
                .selectFrom(member)
                .where(
                    member.email.eq(email),
                    member.name.eq(name)
                )
                .fetch();
    }
} 