package com.store.car.service;

import com.store.car.dto.OwnerPostDto;
import com.store.car.entity.OwnerPostEntity;
import com.store.car.repository.OwnerPostRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService {

    private final OwnerPostRepository ownerPostRepository;

    @Autowired
    public OwnerPostServiceImpl(OwnerPostRepository ownerPostRepository) {
        this.ownerPostRepository = ownerPostRepository;
    }

    @Override
    public void createOwnerPost(OwnerPostDto dto) {
        var owner = new OwnerPostEntity();
        BeanUtils.copyProperties(dto, owner);
        ownerPostRepository.save(owner);
    }
}
