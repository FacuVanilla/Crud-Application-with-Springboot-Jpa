package com.seun.thursday2.repository;

import com.seun.thursday2.entity.Buddy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuddyRepository extends JpaRepository<Buddy, Integer> {
}
