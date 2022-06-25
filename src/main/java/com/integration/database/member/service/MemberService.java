package com.integration.database.member.service;

import com.integration.database.member.model.data.MemberData;
import com.integration.database.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public MemberData getMemberById(long memberId) {
        return memberRepository.findById(memberId).get();
    }

    /*public MemberData getMemberByName(String name) {
        return StreamSupport.stream(memberRepository.findAll().spliterator(), false)
                .filter(member -> member);
    }*/

}
