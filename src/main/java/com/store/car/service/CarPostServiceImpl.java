package com.store.car.service;

import com.store.car.dto.CarPostDto;
import com.store.car.entity.CarPostEntity;
import com.store.car.repository.CarPostRepository;
import com.store.car.repository.OwnerPostRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarPostServiceImpl implements CarPostService {

    private final CarPostRepository carPostRepository;
    private final OwnerPostRepository ownerPostRepository;

    @Autowired
    public CarPostServiceImpl(CarPostRepository carPostRepository, OwnerPostRepository ownerPostRepository) {
        this.carPostRepository = carPostRepository;
        this.ownerPostRepository = ownerPostRepository;
    }

    @Override
    public void newPostDetails(CarPostDto dto) {
        var entity = new CarPostEntity();
        BeanUtils.copyProperties(dto, entity);

        var owner = ownerPostRepository.findById(dto.getOwnerId()).orElseThrow();
        entity.setOwnerPost(owner);
        entity.setContact(owner.getContactNumber());
        entity.setCreatedAt(String.valueOf(new Date()));

        carPostRepository.save(entity);
    }

    @Override
    public List<CarPostDto> getCarSales() {
        return carPostRepository.findAll().stream()
                .map(CarPostDto::fromModel)
                .toList();
    }

    @Override
    public void changeCarSale(CarPostDto dto, Long id) {
        var carEntity = carPostRepository.findById(id)
                .orElseThrow();
        BeanUtils.copyProperties(dto, carEntity);
        carPostRepository.save(carEntity);
    }

    @Override
    public void removeCarSale(Long id) {
        carPostRepository.deleteById(id);
    }
}
