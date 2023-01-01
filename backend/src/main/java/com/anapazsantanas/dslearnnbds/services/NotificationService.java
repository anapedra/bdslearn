package com.anapazsantanas.dslearnnbds.services;

import com.anapazsantanas.dslearnnbds.dto.NotificationDTO;
import com.anapazsantanas.dslearnnbds.entities.Notification;
import com.anapazsantanas.dslearnnbds.entities.User;
import com.anapazsantanas.dslearnnbds.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {


    @Autowired
    private NotificationRepository notificationRepository;
    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationForCurrentUser(Pageable pageable){
      User user=authService.authenticated();
      Page<Notification> page = notificationRepository.findByUser(user,pageable);
      return page.map(x -> new NotificationDTO(x));

    }


}
