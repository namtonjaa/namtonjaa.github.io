package com.annonymous.webproject.service;

import com.annonymous.webproject.entity.AppUser;

public interface AppUserService {
    AppUser matchUserNameAndPassword(String userName, String password);

}
