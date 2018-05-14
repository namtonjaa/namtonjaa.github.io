package com.annonymous.webproject.service;

import com.annonymous.webproject.entity.AppUser;
import com.annonymous.webproject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public AppUser matchUserNameAndPassword(String userName, String password) {
        return userRepo.matchUserNameAndPassword(userName,password);
    }
}
