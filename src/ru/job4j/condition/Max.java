package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maximum = left >= right;
        return maximum ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(50, 60));
        System.out.println(Max.max(55, 6));
        System.out.println(Max.max(-70, -6));
    }
}
