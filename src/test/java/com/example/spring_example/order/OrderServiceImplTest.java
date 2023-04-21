package com.example.spring_example.order;

import com.example.spring_example.member.Grade;
import com.example.spring_example.member.Member;
import com.example.spring_example.member.MemberService;
import com.example.spring_example.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.w3c.dom.html.HTMLBRElement;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void 주문(){
        //given
        Member member = new Member(1L, "Hello", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(member.getId(), "itemA", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}