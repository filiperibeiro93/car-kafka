package com.store.car.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_post")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CarPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "car_model")
    private String model;

    @Column(name = "car_brand")
    private String brand;

    @Column(name = "car_price")
    private String price;

    @Column(name = "car_description")
    private String description;

    @Column(name = "car_engine")
    private String engineVersion;

    @Column(name = "car_city")
    private String city;

    @Column(name = "createdAt")
    private String createdAt;

    @Column(name = "car_post_contact")
    private String contact;


}
