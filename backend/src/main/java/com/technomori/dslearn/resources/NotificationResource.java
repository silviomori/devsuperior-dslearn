package com.technomori.dslearn.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technomori.dslearn.dtos.NotificationDTO;
import com.technomori.dslearn.services.NotificationService;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {

	@Autowired
	private NotificationService service;

	@GetMapping
	public ResponseEntity<Page<NotificationDTO>> getNotificationsForCurrentUser(@PageableDefault Pageable pageable,
			@RequestParam(name = "unreadOnly", defaultValue = "false") Boolean unreadOnly) {
		Page<NotificationDTO> page = service.getNotificationsForCurrentUser(unreadOnly, pageable);
		return ResponseEntity.ok(page);
	}

}
