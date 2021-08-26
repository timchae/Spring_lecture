package com.hello.core.scan;

import com.hello.core.AutoAppConfig;
import com.hello.core.member.MemberService;
import com.hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AutoAppConfigTest {


    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean("memberServiceImpl", MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
