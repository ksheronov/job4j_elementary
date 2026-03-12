package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    void whenCalculateFactorialFor5ThenOne120() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor6Then720() {
        int expected = 720;
        int number = 6;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

}