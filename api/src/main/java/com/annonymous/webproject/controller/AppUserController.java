package com.annonymous.webproject.controller;

import com.annonymous.webproject.entity.AppUser;
import com.annonymous.webproject.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/login")
    public ResponseEntity<Object> Login(@RequestParam(name = "userName") String userName,
                                        @RequestParam(name = "password") String password){
        AppUser user = appUserService.matchUserNameAndPassword(userName, password);

        if (user != null) {
            return new ResponseEntity<Object>(user, HttpStatus.OK);
        }
        return new ResponseEntity<Object>("user not found", HttpStatus.OK);
    }
}
