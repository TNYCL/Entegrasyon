package com.integration.database.member.repository;

import com.integration.database.member.model.data.MemberData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends CrudRepository<MemberData, Long> {
}
