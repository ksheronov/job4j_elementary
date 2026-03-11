package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {

    @Test
    void whenLength6AndWidth5ThenDiagonal7Dot81() {


        double length = 6;
        double width = 5;
        double expected = 7.81;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength3AndWidth10ThenDiagonal10Dot44() {
        double length = 3;
        double width = 10;
        double expected = 10.44;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength12AndWidth5ThenDiagonal13() {
        double length = 12;
        double width = 5;
        double expected = 13.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}