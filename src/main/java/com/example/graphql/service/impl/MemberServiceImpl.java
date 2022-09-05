package com.example.graphql.service.impl;

import com.example.graphql.model.Member;
import com.example.graphql.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    private List<Member> memberRepository = new ArrayList<>();

    {
        memberRepository.add(new Member("정윤종",29));
        memberRepository.add(new Member("홍길동",31));
    }

    @Override
    public Member member(String name) {
        return memberRepository.stream().filter(member -> member.getName().equals(name)).findAny().get();
    }

    @Override
    public List<Member> members() {
        return memberRepository;
    }

    @Override
    public Member newMember(String name, int age) {
        Member member = new Member(name,age);
        memberRepository.add(member);

        return member;
    }
}
