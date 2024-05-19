package com.store.car.service;

import com.store.car.dto.CarPostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostService {

    void newPostDetails(CarPostDto dto);

    List<CarPostDto> getCarSales();

    void changeCarSale(CarPostDto dto, Long id);

    void removeCarSale(Long id);
}
