package com.starter.architecture.controllers;

import com.starter.architecture.domain.User;
import com.starter.architecture.repositories.UserRepository;
import com.starter.architecture.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransferController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransferService transferService;

    @GetMapping("/users")
    public List<User> allUsers() {
        return (List<User>)userRepository.findAll();
    }


    @PostMapping("/transfer/from/{userFrom}/to/{userTo}/count/{count}")
    public void transfer(@PathVariable("userFrom") String userFrom,
                         @PathVariable("userTo") String userTo,
                         @PathVariable("count") long count) {

        transferService.transfer(userFrom,userTo,count);
    }
}
