package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void whenPoints00And40Then4() {
        int x1 = 0, y1 = 0, x2 = 4, y2 = 0;
        double expected = 4.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus10And1And1Then11Dot18() {
        int x1 = -1, y1 = -10, x2 = 1, y2 = 1;
        double expected = 11.18;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus5Minus3And2And1Then8Dot06() {
        int x1 = -5, y1 = -3, x2 = 2, y2 = 1;
        double expected = 8.06;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}