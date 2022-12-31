package com.anapazsantanas.dslearnnbds.services;

import com.anapazsantanas.dslearnnbds.entities.User;
import com.anapazsantanas.dslearnnbds.repositories.UserRepository;
import com.anapazsantanas.dslearnnbds.services.exceptionservices.ForbiddenException;
import com.anapazsantanas.dslearnnbds.services.exceptionservices.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User authenticated(){
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        }
        catch (Exception e){
            throw new UnauthorizedException("Invalid User!");
        }
    }
    public void validateSelfOrAdmim(Long userId){
       User user=authenticated();
       if (!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")){ // CONFERIR SE É || OU &&
           throw new ForbiddenException("Access denied");
       }

    }

}
