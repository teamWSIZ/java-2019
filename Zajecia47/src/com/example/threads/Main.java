package com.example.threads;

import java.util.ArrayList;

class Worker implements Runnable{

    private static int no = 0;
    private int mNo;

    Worker(){
        mNo = no;
        no++;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Worker(" + mNo + "): i=" + i);
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

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new Worker());
            threadArray.add(thread);
        }

        threadArray.forEach(Thread::start);

    }
}
