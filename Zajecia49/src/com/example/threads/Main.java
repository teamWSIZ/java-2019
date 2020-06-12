package com.example.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };*/

        Runnable runnable = ()->{
            boolean interrupted = false;
            while(!interrupted) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println(e.getMessage());
                    interrupted = true;
                }
                System.out.println("runnable1");
            }
        };

        //runnable.run();

        Thread thread = new Thread(runnable);
        thread.start();

        TimeUnit.SECONDS.sleep(5);
        thread.interrupt();

        Callable<Double> callable = ()->{
            double result = 0;

            for(int i=0;i<100;i++) {
                result += Math.sin(i);
                TimeUnit.MILLISECONDS.sleep(10);
                System.out.println("result = "+result);
            }

            return result;
        };

        try {
            System.out.println("Wynik obliczeń:" +callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
