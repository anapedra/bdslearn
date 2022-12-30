package com.anapazsantanas.dslearnnbds.repositories;

import com.anapazsantanas.dslearnnbds.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
