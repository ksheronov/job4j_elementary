package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void whenPoints00And40Then4() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double expected = 4;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPointsMinus1Minus10And1And1Then11Dot18() {
        Point a = new Point(-1, -10);
        Point b = new Point(1, 1);
        double expected = 11.18;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus5Minus3And2And1Then8Dot06() {
        Point a = new Point(-5, -3);
        Point b = new Point(2, 1);
        double expected = 8.06;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint2Minus10And3And4ThenDistance14() {
        Point a = new Point(2, -10);
        Point b = new Point(3, 4);
        double expected = 14;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPoint2Minus105And346ThenDistance14() {
        Point a = new Point(2, -10, 5);
        Point b = new Point(3, 4, 6);
        double expected = 14;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPoint021And346ThenDistance6Dot1() {
        Point a = new Point(0, 2, 1);
        Point b = new Point(3, 4, 6);
        double expected = 6.1;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}