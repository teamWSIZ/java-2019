package com.example.objects;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

enum Month {
    Styczen, Luty, Marzec, Kwiecien, Maj, Czerwiec;
}

public class Main {

    Deque<String> seasonsLog = new ArrayDeque<>();

    public static void main(String[] args) {
        // write your code here
        var array1 = new ArrayList<Double>();
        var a = 10.0;

        Main main = new Main();

        Month month = Month.Kwiecien;
        System.out.println(main.season2(month));

    }

    void season(Month month) {
        String nameOfSeason = "";

        switch (month) {
            case Styczen:
            case Luty:
                nameOfSeason = "Zima";
                break;
            case Marzec:
            case Kwiecien:
            case Maj:
                nameOfSeason = "Wiosna";
                break;
            default:
                nameOfSeason = "Inna pora roku";
        }

        System.out.println(nameOfSeason);
    }

    String season1(Month month) {
        String nameOfSeason = "";

        switch (month) {
            case Styczen, Luty -> nameOfSeason = "Zima";
            case Marzec, Kwiecien, Maj -> nameOfSeason = "Wiosna";
            default -> nameOfSeason = "Inna pora roku";
        }

        //System.out.println(nameOfSeason);
        return nameOfSeason;
    }

    String season2(Month month) {
        String nameOfSeason =

                switch (month) {
                    case Styczen, Luty -> "Zima";
                    case Marzec, Kwiecien, Maj -> "Wiosna";
                    default -> "Inna pora roku";
                };

        //System.out.println(nameOfSeason);
        return nameOfSeason;
    }
}
