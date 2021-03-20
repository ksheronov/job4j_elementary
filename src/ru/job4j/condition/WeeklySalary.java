package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int money = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i == 5 || i == 6) {
                if (hours[i] <= 8) {
                    money = money + (hours[i] * 20);
                } else {
                    money = money + ((hours[i] - 8) * 30) + ((8 * 20));
                }

            }
            if (i < 5) {
                if (hours[i] <= 8) {
                    money = money + (hours[i] * 10);
                } else {
                    money = money + ((hours[i] - 8) * 15) + (8 * 10);
                }
            }
        }

        return money;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(calculate(hours));
    }

}