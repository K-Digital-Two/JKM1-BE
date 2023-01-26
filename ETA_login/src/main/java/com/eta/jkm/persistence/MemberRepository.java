package com.eta.jkm.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eta.jkm.domain.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
