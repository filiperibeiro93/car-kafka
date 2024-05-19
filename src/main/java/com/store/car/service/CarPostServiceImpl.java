package com.store.car.service;

import com.store.car.dto.CarPostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostServiceImpl implements CarPostService {

    @Override
    public void newPostDetails(CarPostDto dto) {

    }

    @Override
    public List<CarPostDto> getCarSales() {
        return null;
    }

    @Override
    public void changeCarSale(CarPostDto dto, Long id) {

    }

    @Override
    public void removeCarSale(Long id) {

    }
}
