package com.example.eCabCardio.repository;

import com.example.eCabCardio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
