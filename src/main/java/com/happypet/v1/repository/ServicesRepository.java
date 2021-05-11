package com.happypet.v1.repository;

import com.happypet.v1.model.services.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepository extends JpaRepository<Services, Integer> {
}
