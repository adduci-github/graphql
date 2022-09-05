package com.example.graphql.service;

import com.example.graphql.model.Member;

import java.util.List;

public interface MemberService {
    public Member member(String name);
    public List<Member> members();
}
