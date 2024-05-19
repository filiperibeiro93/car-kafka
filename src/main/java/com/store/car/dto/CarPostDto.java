package com.store.car.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.store.car.entity.CarPostEntity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
public class CarPostDto {

    private String model;
    private String brand;
    private String price;
    private String description;
    private String engineVersion;
    private String city;
    private String createdAt;
    private Long ownerId;
    private String ownerName;
    private String ownerType;
    private String contact;

    public static CarPostDto fromModel(CarPostEntity entity) {
        return CarPostDto.builder()
                .brand(entity.getBrand())
                .city(entity.getCity())
                .model(entity.getModel())
                .description(entity.getDescription())
                .engineVersion(entity.getEngineVersion())
                .createdAt(entity.getCreatedAt())
                .ownerName(entity.getOwnerPost().getName())
                .price(entity.getPrice())
                .build();
    }
}
