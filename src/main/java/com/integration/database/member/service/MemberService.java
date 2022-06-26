package com.integration.database.member.service;

import com.integration.database.member.model.data.MemberData;
import com.integration.database.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.StreamSupport;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public MemberData getMemberById(long memberId) {
        return memberRepository.findById(memberId).get();
    }

    public MemberData getMemberByName(String name) {
        return StreamSupport.stream(memberRepository.findAll().spliterator(), false)
                .filter(member -> member.getUserName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public MemberData getMemberByLicenseKey(String licenseKey) {
        return StreamSupport.stream(memberRepository.findAll().spliterator(), false)
                .filter(member -> member.getLicenseKey().equals(licenseKey)).findFirst().orElse(null);
    }

    public void saveMember(MemberData member) { memberRepository.save(member); }

    public void deleteMember(long memberId) { memberRepository.deleteById(memberId); }

    public void updateProduct(MemberData member) { memberRepository.save(member); }

}
