package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
