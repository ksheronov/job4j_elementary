package ru.job4j.condition;

public class Vector {
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xRes = x1 + x2;
        int yRes = y1 + y2;
        return String.format("(%d, %d)", xRes, yRes);
    }

    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}
