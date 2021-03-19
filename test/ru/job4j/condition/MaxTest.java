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
}