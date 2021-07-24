package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
