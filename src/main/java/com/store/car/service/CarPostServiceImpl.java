package com.store.car.service;

import com.store.car.dto.CarPostDto;
import com.store.car.repository.CarPostRepository;
import com.store.car.repository.OwnerPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    }

    @Override
    public List<CarPostDto> getCarSales() {
        return carPostRepository.findAll().stream()
                .map(CarPostDto::fromModel)
                .toList();
    }

    @Override
    public void changeCarSale(CarPostDto dto, Long id) {

    }

    @Override
    public void removeCarSale(Long id) {

    }
}
