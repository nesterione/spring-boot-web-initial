package com.starter.architecture.services;

import com.starter.architecture.domain.User;
import com.starter.architecture.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.TransactionManager;

@Service
public class TransferService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void transfer(String usernameFrom, String usernameTo, long money) {

        User userFrom = userRepository.findByUsername(usernameFrom);
        User userTo = userRepository.findByUsername(usernameTo);

        userFrom.setMoney(userFrom.getMoney()-money);

        userRepository.save(userFrom);

        boolean b = true;
        if (b) {
            throw new RuntimeException();
        }

        userTo.setMoney(userTo.getMoney()+money);
        userRepository.save(userTo);
    }

}
