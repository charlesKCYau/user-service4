package com.yau.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yau.user.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
