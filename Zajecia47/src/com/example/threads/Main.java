package com.example.threads;

class Worker implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++)
            System.out.println("Worker(1): i="+i);
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println("i="+i);
                }
            }
        };

        runnable.run();

        Worker worker = new Worker();
        worker.run();

    }
}
