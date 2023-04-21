package com.example.spring_example.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
