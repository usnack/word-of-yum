package io.usnack.wordofyum.domain.restaurant;

import io.usnack.wordofyum.domain.restaurant.vo.Location;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class RestaurantRepositoryTest {
    @Autowired
    RestaurantRepository restaurantRepository;

    @Test
    void createTest() {
        System.out.println("Hello Test");
        Restaurant restaurant = new Restaurant();
        restaurant.setName("MATJIP");
        Location location = new Location(1,2, "a", "b");
        restaurant.setLocation(location);

        Restaurant saved = restaurantRepository.save(restaurant);

        Optional<Restaurant> byId = restaurantRepository.findById(saved.getId());
        log.debug("byid: {}", byId);
    }

}