package com.anapazsantanas.dslearnnbds.repositories;

import com.anapazsantanas.dslearnnbds.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmantRepository extends JpaRepository<Enrollment,Long> {
}
