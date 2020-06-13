package com.example.threads;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.example();
    }

    void example() throws Exception {
        Callable<Double> callable0 = squareEquation(5,5,5);
        Callable<Double> callable1 = squareEquation(1,10,8);

        //System.out.println("Równanie 1: "+callable0.call());
        //System.out.println("Równanie 2: "+callable1.call());

        ExecutorService service = Executors.newWorkStealingPool();

        Future<Double> future0 = service.submit(callable0);
        Future<Double> future1 = service.submit(callable1);

        System.out.println("Oczekuję na wykonanie zadań...");
        Long startTime = System.currentTimeMillis();

        System.out.println("Równanie 0: "+future0.get());
        System.out.println("Równanie 1: "+future1.get());

        Long endTime = System.currentTimeMillis();

        service.shutdown();
        System.out.println("Zakończono obliczenia: "+(endTime-startTime)+"ms");

    }

    Callable<Double> squareEquation(double A, double B, double C){
        return ()->{
            double result = 0.0;

            try {
                for (double i = 0; i <= 100; i++) {
                    TimeUnit.MILLISECONDS.sleep(10);
                    result += A * i * i + B * i + C;

                    //System.out.println(Thread.currentThread().getName()+" Partial result: "+result);
                }
            }catch(InterruptedException e){
                System.out.println("Przerwano obliczenia: "+e.getMessage());
                result = -1;
            }
            return result;
        };
    }
}
