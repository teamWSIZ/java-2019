package com.example.threads;

public class Main {

    int i = 0;
    final Object obj1 = new Object();
    final Object obj2 = new Object();

    public static void main(String[] args) {
        Main main = new Main();
        // write your code here

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                while (true) {
                    main.addSub();
                }
            });

            thread.start();
        }

        Thread th = new Thread(() -> {
            while (true) {
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

    void add() {
        i++;
    }

    void sub() {
        i--;
    }

    void addSub() {
        synchronized(obj1) {
            add();
            sub();
        }
    }
}
