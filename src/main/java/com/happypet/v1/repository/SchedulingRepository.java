package com.happypet.v1.repository;

import com.happypet.v1.model.scheduling.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulingRepository extends JpaRepository<Scheduling, Integer> {
}
