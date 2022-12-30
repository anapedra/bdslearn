package com.anapazsantanas.dslearnnbds.repositories;

import com.anapazsantanas.dslearnnbds.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
