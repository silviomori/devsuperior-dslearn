package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
