package com.anapazsantanas.dslearnnbds.resources;

import com.anapazsantanas.dslearnnbds.dto.DeliverRevisionDTO;
import com.anapazsantanas.dslearnnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {
    @Autowired
    private DeliverService deliverService;

    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto){
        deliverService.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }


}
