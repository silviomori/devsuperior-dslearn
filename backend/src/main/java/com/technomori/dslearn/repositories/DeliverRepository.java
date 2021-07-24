package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Deliver;

public interface DeliverRepository extends JpaRepository<Deliver, Long> {

}
