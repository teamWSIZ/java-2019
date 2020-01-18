package com.example.objects;

import java.util.ArrayList;

public class Sala {
    private ArrayList<Komputer> mKomputery = new ArrayList<>();
    private ArrayList<Okno> mOkna = new ArrayList<>();
    private ArrayList<Krzeslo> mKrzesla = new ArrayList<>();
    private ArrayList<Student> mStudenci = new ArrayList<>();

    public Sala(int ilosc_okien, int krzesla, int komputery) {
        for(int i=0;i<ilosc_okien;i++)
            mOkna.add(new Okno(2.5, 2.0));

        for(int i=0;i<krzesla;i++)
            mKrzesla.add(new Krzeslo());
    }

    @Override
    public String toString() {
        return "Okna:" + mOkna.size()
                + " Krzesla: " + mKrzesla.size()
                + " Komputery: " + mKomputery.size() + " Studenci: "
                + mStudenci.size();
    }

    public void dodajStudenta(Student student){
        mStudenci.add(student);
    }

    public void dodajGrupe(ArrayList<Student> studenci){
        mStudenci.addAll(studenci);
    }

    public Double powierzchniaOkien(){
        return 0.0;
    }
}
