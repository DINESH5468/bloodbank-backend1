package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BloodBackendApplicationTests {

    @Test
    void contextLoads() {
        // ✅ Checks that the Spring context starts correctly
        assertThat(true).isTrue();
    }
}