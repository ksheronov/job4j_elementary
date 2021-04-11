package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return one >= two ? one : two;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(50, 60));
        System.out.println(Max.max(55, 6));
        System.out.println(Max.max(-70, -6));
    }
}
