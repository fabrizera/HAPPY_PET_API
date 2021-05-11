package com.happypet.v1.repository;

import com.happypet.v1.model.professional.Professional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionalRepository extends JpaRepository<Professional, Integer> {
}
