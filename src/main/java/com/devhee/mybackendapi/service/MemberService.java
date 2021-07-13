package com.devhee.mybackendapi.service;

import com.devhee.mybackendapi.model.Member;
import com.devhee.mybackendapi.repository.JpaMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    JpaMemberRepository jpaMemberRepository;

    @Autowired
    public MemberService(JpaMemberRepository jpaMemberRepository){
        this.jpaMemberRepository=jpaMemberRepository;
    }
    public Member create(Member Member) {
        return jpaMemberRepository.save(Member);
    }

    public Optional<Member> read(Long id) {
        return jpaMemberRepository.findById(id);
    }

    public Member update(Long id,int age) {
        Member Member = read(id).get();
        Member.setAge(age);
        return jpaMemberRepository.save(Member);
    }

    public void delete(Long id) {
        jpaMemberRepository.deleteById(id);
    }
}
