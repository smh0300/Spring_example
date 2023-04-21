package com.example.spring_example.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void 회원가입(){
        //given
        Member member = new Member(1L, "helloworld", Grade.BASIC);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());

        //then
        assertThat(member).isEqualTo(findMember);
    }
}