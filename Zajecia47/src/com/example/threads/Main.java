package com.example.threads;

import java.util.ArrayList;

class Worker implements Runnable{

    private static int no = 0;
    private int number;

    Worker(){
        number = no;
        no++;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Worker(" + number + "): i=" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here

        /*for(int i=0;i<10;i++) {
            Worker worker = new Worker();
            worker.run();
        }*/

        ArrayList<Thread> threadArray = new ArrayList<>();

        for(int i=0;i<100;i++){
            Thread thread = new Thread(new Worker());
            threadArray.add(thread);
        }

        threadArray.forEach(Thread::start);


        Thread th1 = new Thread(()->{
            while(true){
                System.out.println("info...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        th1.start();

    }
}
