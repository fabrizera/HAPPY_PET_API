package com.happypet.v1.repository;

import com.happypet.v1.model.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
