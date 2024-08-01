package io.usnack.wordofyum.domain.review;

import io.usnack.wordofyum.domain.restaurant.Restaurant;
import io.usnack.wordofyum.domain.restaurant.RestaurantRepository;
import io.usnack.wordofyum.domain.restaurant.vo.Location;
import io.usnack.wordofyum.domain.user.User;
import io.usnack.wordofyum.domain.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ReviewRepositoryTest {
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RestaurantRepository restaurantRepository;

    @Transactional
    @Test
    void createReviewsTest() {
        User user = new User("usnack", "usnack@usnack.io", "pw1234");
        User savedUser = userRepository.save(user);
        log.debug("savedUser: {}", savedUser);

        Restaurant restaurant = new Restaurant("맛소문", new Location(1, 2, "맛소문로 23"));
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        log.debug("savedRestaurant: {}", savedRestaurant);

        Review review1 = new Review(savedUser, savedRestaurant, 3, "그냥 그래요.");
        Review review2 = new Review(savedUser, savedRestaurant, 1, "별로예요.");
        Review review3 = new Review(savedUser, savedRestaurant, 5, "최고에요.");
        List<Review> savedReviews = reviewRepository.saveAll(List.of(review1, review2, review3));
        log.debug("savedReviews: {}", savedReviews);



    }

    @Transactional
    @Test
    void getReviewTest() {
        Restaurant res = restaurantRepository.findById(4L).get();
        log.debug("Restaurant query: {}", res.getName());
        List<Review> reviews = res.getReviews();
        log.debug("get Reviews: {}", reviews);

    }
}