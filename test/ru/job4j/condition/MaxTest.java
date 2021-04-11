package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax30To2Then30() {
        int left = 30;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To20Then20() {
        int left = 10;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To15Then15() {
        int left = 15;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThree() {
        int one = 15;
        int two = 10;
        int three = 30;
        int result = Max.max(one, two, three);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFour() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int result = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}