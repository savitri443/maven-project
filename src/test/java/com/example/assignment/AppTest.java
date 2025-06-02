package com.example.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("Savitri");
        assertEquals("Hello, Savitri!", result);
    }
}
