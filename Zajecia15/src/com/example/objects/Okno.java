package com.example.objects;

public class Okno implements Comparable{
    private Double lenght;
    private Double width;

    private Double area;

    private Okno(){
    }

    public Okno(Double length, Double width){
        this.lenght = length;
        this.width = width;

        this.area = this.lenght*this.width;
    }

    @Override
    public int compareTo(Object o) {
        if(area>((Okno)o).getArea())
            return 1;
        if(area<((Okno)o).getArea())
            return -1;

        return 0;
    }

    public Double getArea() {
        return area;
    }
}
