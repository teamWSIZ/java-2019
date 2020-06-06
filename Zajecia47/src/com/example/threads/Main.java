package com.example.threads;

class Worker implements Runnable{

    private static int no = 0;

    Worker(){
        no++;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
            System.out.println("Worker("+no+"): i="+i);
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here

        for(int i=0;i<10;i++) {
            Worker worker = new Worker();
            worker.run();
        }

    }
}
