package com.example.objects;

public class Main {

    public static void main(String[] args) {
	    Sala sala41 = new Sala(4,40,20);
	    Sala sala21 = new Sala(5,40,0);

	    System.out.println(sala41.toString());
        System.out.println(sala21.toString());

        for(int i=0;i<20;i++)
            sala41.dodajStudenta(new Student("Przemyslaw","Stoklosa",1));

        rozpocznijWyklad();

        System.out.println(sala41.toString());
        System.out.println(sala21.toString());
    }

    public static void rozpocznijWyklad(){

    }
}
