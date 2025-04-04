package com.fahitahmed.baruchclub.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fahitahmed.baruchclub.entities.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {
} 