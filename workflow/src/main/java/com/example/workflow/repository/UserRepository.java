package com.example.workflow.repository;

//public class UserRepository {
//
//}

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.workflow.model.Job;
import com.example.workflow.model.User;

@Component("users")
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);

}