package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax10To20Then20() {
        int one = 10;
        int two = 20;
        int output = Max.findMax(one, two);
        int expected = 20;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void whenMax15To15Then15() {
        int one = 15;
        int two = 15;
        int output = Max.findMax(one, two);
        int expected = 15;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void whenMax30() {
        int one = 15;
        int two = 10;
        int three = 30;
        int output = Max.findMax(one, two, three);
        int expected = 30;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void whenMax4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int output = Max.findMax(one, two, three, four);
        int expected = 4;
        assertThat(output).isEqualTo(expected);
    }
}