package com.example.textblocks;

public class Main {

    public static void main(String[] args) {

        String simpleText = "Pierwsza linia tekstu\n"
                +"Kolejna linia tekstu";

        //Text block dostępny od java 14.0.1 preview

        String blockText = """
                Pierwsza linia tekstu
                Kolejna linia tekstu
                """;

        System.out.println(simpleText);
        System.out.println(blockText);
    }
}
