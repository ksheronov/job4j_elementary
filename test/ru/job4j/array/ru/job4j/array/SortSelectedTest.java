package ru.job4j.array.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSorFive() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortTen() {
        int[] data = new int[]{3, 4, 1, 0, 8, 5, -1, 7, 6, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

}