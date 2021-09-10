package com.hello.servlet.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void save(){
        Member member = new Member("hello", 20);
        
        Member savedMember = memberRepository.save(member);

        Member findMember = memberRepository.findeById(savedMember.getId());
        Assertions.assertThat(findMember).isEqualTo(savedMember);

    }

    @Test
    void findAll(){
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);


    }
}