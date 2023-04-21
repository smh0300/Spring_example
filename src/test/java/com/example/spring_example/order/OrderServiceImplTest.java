package com.example.spring_example.order;

import com.example.spring_example.AppConfig;
import com.example.spring_example.member.Grade;
import com.example.spring_example.member.Member;
import com.example.spring_example.member.MemberService;
import com.example.spring_example.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.w3c.dom.html.HTMLBRElement;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();
    @Test
    void 주문(){
        //given
        Member member = new Member(1L, "Hello", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(member.getId(), "itemA", 10000);

        //then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}