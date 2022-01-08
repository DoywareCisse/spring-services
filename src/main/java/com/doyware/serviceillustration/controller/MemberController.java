package com.doyware.serviceillustration.controller;

import com.doyware.serviceillustration.model.Member;
import com.doyware.serviceillustration.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/members")
public class MemberController {

    @Autowired
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/all")
    public List<Member> getAllMembers() {
        return  this.memberService.getMembers();
    }

    @PostMapping("/add")
    public Member save(@RequestBody Member member) {
        return this.memberService.save(member);
    }
}
