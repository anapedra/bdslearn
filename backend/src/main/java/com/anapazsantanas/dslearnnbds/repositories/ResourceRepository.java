package com.anapazsantanas.dslearnnbds.repositories;

import com.anapazsantanas.dslearnnbds.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource,Long> {
}
