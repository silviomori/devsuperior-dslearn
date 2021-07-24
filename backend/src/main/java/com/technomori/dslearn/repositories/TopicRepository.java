package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
