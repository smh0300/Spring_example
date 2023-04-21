package com.example.spring_example.order;

import com.example.spring_example.discount.DiscountPolicy;
import com.example.spring_example.discount.FixDiscountPolicy;
import com.example.spring_example.member.Member;
import com.example.spring_example.member.MemberRepository;
import com.example.spring_example.member.MemoeryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoeryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
