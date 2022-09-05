package com.example.graphql.controller;

import com.example.graphql.model.Member;
import com.example.graphql.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class GraphQLController {
    @Autowired
    private MemberService memberService;

    @QueryMapping
    public Member member(@Argument String name){
        return memberService.member(name);
    }

    @QueryMapping
    public List<Member> members(){
        return memberService.members();
    }
}
