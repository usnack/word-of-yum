package io.usnack.wordofyum.domain.user;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void createUserTest() {
        User user = new User("usnack", "usnack@usnack.io", "pw1234");
        User savedUser = userRepository.save(user);
        log.debug("savedUser: {}", savedUser);


    }
}