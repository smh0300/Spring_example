package com.example.spring_example;

import com.example.spring_example.discount.FixDiscountPolicy;
import com.example.spring_example.discount.RateDiscountPolicy;
import com.example.spring_example.member.Member;
import com.example.spring_example.member.MemberService;
import com.example.spring_example.member.MemberServiceImpl;
import com.example.spring_example.member.MemoeryMemberRepository;
import com.example.spring_example.order.OrderService;
import com.example.spring_example.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){ // 생성자 주입
        return new MemberServiceImpl(new MemoeryMemberRepository());
    }

    public OrderService orderService(){ // 생성자 주입
        return new OrderServiceImpl(new MemoeryMemberRepository(), new FixDiscountPolicy());
    }
}
