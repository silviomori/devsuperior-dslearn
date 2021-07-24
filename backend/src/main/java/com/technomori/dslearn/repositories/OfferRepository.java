package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
