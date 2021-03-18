package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int eurin = 140;
        int usin = 120;
        int eurexpected = 2;
        int usexpected = 2;
        int eurout = Converter.rubleToEuro(eurin);
        int usout = Converter.rubleToDollar(usin);
        boolean eurpassed = eurexpected == eurout;
        boolean uspassed = usexpected == usout;
        System.out.println("140 rubles are 2 eur. Test result : " + eurpassed);

        System.out.println("120 rubles are 2 usd. Test result : " + uspassed);
/*
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int usd = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + usd + " usd.");*/
    }

}
