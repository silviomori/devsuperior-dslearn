package com.technomori.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technomori.dslearn.dtos.NotificationDTO;
import com.technomori.dslearn.entities.Notification;
import com.technomori.dslearn.entities.User;
import com.technomori.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;

	@Autowired
	private AuthService authService;

	@Transactional(readOnly = true)
	public Page<NotificationDTO> getNotificationsForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page<Notification> page = notificationRepository.findByUser(user, pageable);
		return page.map(entity -> new NotificationDTO(entity));
	}

}
