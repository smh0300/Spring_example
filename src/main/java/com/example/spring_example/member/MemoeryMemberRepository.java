package com.example.spring_example.member;

import java.util.HashMap;
import java.util.Map;

public class MemoeryMemberRepository implements MemberRepository{
    // 실무에서는 동시성 이슈 때문에 ConcurrentHashMap을 쓰는것을 권장
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
