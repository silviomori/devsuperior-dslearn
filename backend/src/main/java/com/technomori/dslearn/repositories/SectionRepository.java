package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
