package com.example.spring_example.member;

import org.apache.commons.logging.Log;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
