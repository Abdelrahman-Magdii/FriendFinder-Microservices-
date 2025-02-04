package com.spring.usermanagement.controller;

import com.spring.commonlib.exceptions.SysException;
import com.spring.usermanagement.model.dto.auth.OrgDto;
import com.spring.usermanagement.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/create")
    public ResponseEntity<OrgDto> create(@RequestBody Map<String, Object> params)
                    throws SysException {
        return ResponseEntity.status(HttpStatus.CREATED)
                        .body(organizationService.create(params));
    }

}
