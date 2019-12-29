package com.sample.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.common.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
