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

        System.out.println(main.season2(Month.Kwiecien));
        System.out.println(main.season2(Month.Styczen));
        System.out.println(main.season2(Month.Luty));
        System.out.println(main.season2(Month.Maj));

        main.printSeasonLog();

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
        //Uwaga: tutaj można od razu wpisać return
        String nameOfSeason =

                switch (month) {
                    case Styczen, Luty -> {
                        seasonsLog.offer("Zima");
                        yield "Zima";
                    }
                    case Marzec, Kwiecien, Maj -> "Wiosna";
                    default -> "Inna pora roku";
                };

        //System.out.println(nameOfSeason);
        return nameOfSeason;
    }

    void printSeasonLog(){
        System.out.println("______season log_______");
        //seasonsLog.forEach(line->System.out.println(line));
        seasonsLog.forEach(System.out::println);
    }
}
