package com.example.threads;

public class Main {

    int i = 0;

    public static void main(String[] args) {
        Main main = new Main();
	// write your code here

        for(int i=0;i<2;i++) {
            Thread thread = new Thread(() -> {
                while (true) {
                    main.add();
                    main.sub();
                }
            });

            thread.start();
        }

        Thread th = new Thread(()->{
            while(true) {
                System.out.println("i=" + main.i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        th.start();

        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void add(){
        i++;
    }
    void sub(){
        i--;
    }

    synchronized void addSub(){
        add();
        sub();
    }
}
