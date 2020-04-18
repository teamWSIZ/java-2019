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
        System.out.println(main.season(month));
    }

    String season(Month month){
        switch(month){
            case Styczen:
            case Luty:
                return "Zima";
            case Marzec:
            case Kwiecien:
            case Maj:
                return "Wiosna";
            default:
                return "Inna pora roku";
        }
    }
}
