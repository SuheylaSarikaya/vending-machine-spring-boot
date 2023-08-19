package com.example.caseStudy.repos;

import com.example.caseStudy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
