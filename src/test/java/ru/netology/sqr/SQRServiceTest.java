package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSquaresAreCertainRangeOfNumbers() {
        SQRService service = new SQRService();

        int initial = 200;
        int past = 300;
        int expected = 3;

        int actual = service.squaresAreCertainRangeOfNumbers(initial, past);

        assertEquals(expected, actual);
    }

}