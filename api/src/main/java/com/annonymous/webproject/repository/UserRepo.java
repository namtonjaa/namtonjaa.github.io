package com.annonymous.webproject.repository;

import com.annonymous.webproject.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {

    @Query("FROM AppUser WHERE userName = ?1 and password = ?2")
    AppUser matchUserNameAndPassword(String userName, String password);
}
