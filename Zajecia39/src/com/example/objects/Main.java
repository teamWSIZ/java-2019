package com.example.objects;

import java.util.ArrayList;

enum Month{
    Styczen, Luty, Marzec, Kwiecien,Maj,Czerwiec;
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        var array1 = new ArrayList<Double>();
        var a = 10.0;

        Main main = new Main();

        Month month = Month.Kwiecien;
        System.out.println(main.season1(month));

    }

    void season(Month month){
        String nameOfSeason = "";

        switch(month){
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

    String season1(Month month){
        String nameOfSeason = "";

        switch(month){
            case Styczen, Luty -> nameOfSeason = "Zima";
            case Marzec, Kwiecien, Maj -> nameOfSeason = "Wiosna";
            default -> nameOfSeason = "Inna pora roku";
        }

        //System.out.println(nameOfSeason);
        return nameOfSeason;
    }
}
