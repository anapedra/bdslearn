package com.anapazsantanas.dslearnnbds.resources;

import com.anapazsantanas.dslearnnbds.dto.NotificationDTO;
import com.anapazsantanas.dslearnnbds.dto.UserDTO;
import com.anapazsantanas.dslearnnbds.services.NotificationService;
import com.anapazsantanas.dslearnnbds.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {

    @Autowired
    private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>>  notificationServiceForCurrentUser(Pageable pageable) {
        Page<NotificationDTO> page = service.notificationForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }


}
