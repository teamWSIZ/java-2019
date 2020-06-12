package com.example.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Main main = new Main();
        main.example();
    }

    void example() throws Exception {
        Callable<Double> callable0 = squareEquation(5,5,5);
        Callable<Double> callable1 = squareEquation(1,10,8);

        System.out.println("Równanie 1: "+callable0.call());
        System.out.println("Równanie 2: "+callable1.call());
    }

    Callable<Double> squareEquation(double A, double B, double C){
        return ()->{
            double result = 0.0;

            for(double i=0;i<=10;i++){
                TimeUnit.MILLISECONDS.sleep(200);
                result+=A*i*i+B*i+C;
            }
            return result;
        };
    }
}
