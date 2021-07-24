package com.technomori.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technomori.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
