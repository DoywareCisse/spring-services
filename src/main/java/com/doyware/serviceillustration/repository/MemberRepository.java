package com.doyware.serviceillustration.repository;

import com.doyware.serviceillustration.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
