package com.example.objects;

import java.util.ArrayList;

public class Main {
    static ArrayList<Prism> mPrisms = new ArrayList<>();

    public static void main(String[] args) {
        mPrisms.add(new RectangularPrism(5,5,5));
        mPrisms.add(new RectangularPrism(10,5,5));

        for(Prism prism : mPrisms)
            prism.print();
    }
}
