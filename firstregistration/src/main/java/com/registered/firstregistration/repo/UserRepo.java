package com.registered.firstregistration.repo;

import com.registered.firstregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
