package com.doyware.serviceillustration.service;

import com.doyware.serviceillustration.model.Member;
import com.doyware.serviceillustration.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    /*
    * WICHTIG: In der Service Klasse wird die Business-Logik implementiert
    * */

    @Autowired
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getMembers() {
        return this.memberRepository.findAll();
    }

    public Member save(Member member) {
        Member localMember = this.memberRepository.save(member);
        return localMember;
    }
}
