package com.jms.chat.config;

import com.jms.chat.entity.User;
import com.jms.chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataBaseInit {

    @Autowired
    public UserRepository userRepository;

    @PostConstruct
    public void init() {
        User s = new User();
        s.setEmail("11safsa@jdsf.dsfdds");
        s.setName("sad");

        userRepository.save(s);
    }

}
