package com.bobo.service;

import com.bobo.domain.primary.User;
import com.bobo.domain.secondary.Messge;
import com.bobo.repository.primary.UserRepository;
import com.bobo.repository.secondary.MessgeRepository;
import com.bobo.systemset.ISystemSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class SystemSetService implements ISystemSetService {

    @Autowired
    private UserRepository userRepository;//Test数据库

    @Autowired
    private MessgeRepository messgeRepository;//Test_1数据库

    @Override
    @Transactional
    public void save() {
        User user = new User(0,"周勇波","哈哈哈哈");
        userRepository.save(user);
        Messge messge = new Messge(0,"haha",11);
        messgeRepository.save(messge);
    }

}
