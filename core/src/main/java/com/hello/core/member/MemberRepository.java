package com.hello.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findeById(Long memberId);
}
