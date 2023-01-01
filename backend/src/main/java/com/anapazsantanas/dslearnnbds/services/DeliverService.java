package com.anapazsantanas.dslearnnbds.services;

import com.anapazsantanas.dslearnnbds.dto.DeliverRevisionDTO;
import com.anapazsantanas.dslearnnbds.entities.Deliver;
import com.anapazsantanas.dslearnnbds.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto){
        Deliver deliver=deliverRepository.getOne(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        deliverRepository.save(deliver);
    }



}
