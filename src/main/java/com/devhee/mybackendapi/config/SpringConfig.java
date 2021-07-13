package com.devhee.mybackendapi.config;

import com.devhee.mybackendapi.repository.JpaMemberRepository;
import com.devhee.mybackendapi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class SpringConfig {
    private final JpaMemberRepository jpaUserRepository;

    //DI 해주기 외부에서 jpaUserRepository 넣어주기
    @Autowired
    public SpringConfig(JpaMemberRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Bean
    public MemberService userService() {
        return new MemberService(jpaUserRepository);
    }
}
