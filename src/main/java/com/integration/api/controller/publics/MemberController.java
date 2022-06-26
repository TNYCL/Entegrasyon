package com.integration.api.controller.publics;

import com.integration.api.output.Output;
import com.integration.api.output.Status;
import com.integration.database.member.model.data.MemberData;
import com.integration.database.member.service.MemberService;
import com.integration.security.Crypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/member", produces = MediaType.APPLICATION_JSON_VALUE)
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping(value = "/{licenseKey}")
    private <T> Object getMemberInformation(@PathVariable("licenseKey") Object licenseKey) {
        MemberData memberData = memberService.getMemberByLicenseKey(Crypto.decrypt(licenseKey.toString()));

        if(memberData == null) return new Output(Status.ERROR, "invalid.license.key&auth.failed");
        return memberData;
    }

}
