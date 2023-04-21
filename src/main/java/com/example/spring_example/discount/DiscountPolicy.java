package com.example.spring_example.discount;

import com.example.spring_example.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
