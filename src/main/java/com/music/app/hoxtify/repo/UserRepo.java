package com.music.app.hoxtify.repo;

import com.music.app.hoxtify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    @Query(value = "select * from user", nativeQuery = true)
    ArrayList<User> getUsers();
}