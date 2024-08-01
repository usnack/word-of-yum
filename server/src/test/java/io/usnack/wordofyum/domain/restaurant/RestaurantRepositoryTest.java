package io.usnack.wordofyum.domain.restaurant;

import io.usnack.wordofyum.domain.restaurant.vo.Location;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class RestaurantRepositoryTest {
    @Autowired
    RestaurantRepository restaurantRepository;

    @Test
    void createRestaurantTest() {
        Restaurant restaurant = new Restaurant("맛소문", new Location(1, 2, "맛소문로 23"));
        Restaurant saved = restaurantRepository.save(restaurant);
        log.debug("saved: {}", saved);
    }
}