package com.example.SpringJSMySQL.repository;

import com.example.SpringJSMySQL.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByLogin(String login);
}
