package kr.co.suncompany.son.repository;

import kr.co.suncompany.son.entity.Member;
import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findByNameContaining(String name);
    List<Member> findByEmailAndName(String email, String name);
} 