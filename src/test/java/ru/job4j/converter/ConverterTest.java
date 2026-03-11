package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    void whenConvert180RblThen2Euro() {
        double input = 180;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert225RblThen3Dollar() {
        double input = 225;
        double expected = 3;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert900RblThen10Euro() {
        double input = 900;
        double expected = 10;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert350RblThen4dot6666Dollar() {
        double input = 350;
        double expected = 4.6666;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

}