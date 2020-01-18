package com.example.objects;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class Sala {
    private ArrayList<Komputer> mKomputery = new ArrayList<>();
    private ArrayList<Okno> mOkna = new ArrayList<>();
    private ArrayList<Krzeslo> mKrzesla = new ArrayList<>();
    private ArrayList<Student> mStudenci = new ArrayList<>();

    public Sala(int ilosc_okien, int krzesla, int komputery) {
        for (int i = 0; i < ilosc_okien; i++)
            mOkna.add(new Okno(2.5, 2.0));

        for (int i = 0; i < krzesla; i++)
            mKrzesla.add(new Krzeslo());
    }

    @Override
    public String toString() {
        return "Okna:" + mOkna.size()
                + " Krzesla: " + mKrzesla.size()
                + " Komputery: " + mKomputery.size() + " Studenci: "
                + mStudenci.size();
    }

    public void dodajStudenta(Student student) {
        mStudenci.add(student);
    }

    public void dodajGrupe(ArrayList<Student> studenci) {
        mStudenci.addAll(studenci);
    }

    public Double powierzchniaOkien() {
        double powierzchnia = 0;

        for (Okno okno : mOkna)
            powierzchnia += okno.getArea();

        return powierzchnia;
    }

    public void sortujKomputery() {
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        mKomputery.sort((o1, o2) -> collator.compare(o1.getName(),o2.getName()));

    }
}
