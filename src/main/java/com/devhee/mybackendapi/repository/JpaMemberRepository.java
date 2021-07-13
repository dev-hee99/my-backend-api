package com.devhee.mybackendapi.repository;

import com.devhee.mybackendapi.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaMemberRepository extends JpaRepository<Member,Long> {
    @Override // create,update
    Member save(Member member);

    @Override //read
    Optional<Member> findById(Long id);

    @Override //delete
    void deleteById(Long id);
}
