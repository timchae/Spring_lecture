package com.hello.core.order;

import com.hello.core.discount.FixdiscountPolicy;
import com.hello.core.member.Grade;
import com.hello.core.member.Member;
import com.hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void orderOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "naem", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixdiscountPolicy());
        Order order = orderService.createOrder(1L,"itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}