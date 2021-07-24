package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
