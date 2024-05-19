package com.store.car.controller;

import com.store.car.dto.OwnerPostDto;
import com.store.car.service.OwnerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class OwnerPostController {

    private final OwnerPostService ownerPostService;

    @Autowired
    public OwnerPostController(OwnerPostService ownerPostService) {
        this.ownerPostService = ownerPostService;
    }

    @PostMapping
    public ResponseEntity createOwner(@RequestBody OwnerPostDto dto) {
        ownerPostService.createOwnerPost(dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
