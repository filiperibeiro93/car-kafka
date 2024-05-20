package com.store.car.message;

import com.store.car.dto.CarPostDto;
import com.store.car.service.CarPostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumerMessage {

    private final CarPostService carPostService;

    @Autowired
    public KafkaConsumerMessage(CarPostService carPostService) {
        this.carPostService = carPostService;
    }

    @KafkaListener(topics = "car-post-topic", groupId = "store-posts-group")
    public void listening(CarPostDto dto) {
        log.info("CAR STORE - Received Car Post Information: {}", dto);
        carPostService.newPostDetails(dto);
    }

}
