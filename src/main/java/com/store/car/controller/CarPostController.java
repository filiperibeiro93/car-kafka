package com.store.car.controller;

import com.store.car.dto.CarPostDto;
import com.store.car.service.CarPostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class CarPostController {

    private final CarPostService carPostService;

    public CarPostController(CarPostService carPostService) {
        this.carPostService = carPostService;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<CarPostDto>> getCarSales() {
        return ResponseEntity.status(HttpStatus.FOUND).body(carPostService.getCarSales());
    }

    @PutMapping("/car/{id}")
    public ResponseEntity changeCarSale(@RequestBody CarPostDto dto, @PathVariable Long id) {
        carPostService.changeCarSale(dto, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/car/{id}")
    public ResponseEntity removeCarSale(@PathVariable Long id) {
        carPostService.removeCarSale(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
