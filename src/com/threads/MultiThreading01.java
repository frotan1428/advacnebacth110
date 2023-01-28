package com.threads;

class MyTask1{

    void executeTask(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 1 is working..#"+i);
        }
    }

}

class MyTaskWithThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 3 is working..#"+i);
        }
    }
}

public class MultiThreading01 {
    public static void main(String[] args) {
        long appNoThreadStarted = System.currentTimeMillis();
        System.out.println("=====Application without thread started");
        MyTask1 task = new MyTask1();
        task.executeTask();
        for (int i = 1; i<=10; i++){
            System.out.println("Printer 2 is working..#\"+i");
        }
        System.out.println("=====Application without thread ended");
        long appNoThreadEnded = System.currentTimeMillis();
        System.out.println("Total time elapsed for the app without thread: "+(appNoThreadEnded-appNoThreadStarted));
        System.out.println("-----------------------------------------------");

        long appWIthThreadStarted = System.currentTimeMillis();
        System.out.println("=====Application with thread started");
        MyTaskWithThread2 myTaskWithThread2 = new MyTaskWithThread2();

        myTaskWithThread2.start();

        for (int i = 1; i<=10; i++){
            System.out.println("Printer 4 is working..#\"+i");
        }
        System.out.println("=====Application with thread started");
        //join method waits to die/terminate (myTaskWithThread2)
        try {
            //join method waits to die/terminate (myTaskWithThread2)
            myTaskWithThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long appWIthThreadEnded = System.currentTimeMillis();
        System.out.println("Total time elapsed for the app with thread: "+(appWIthThreadEnded - appWIthThreadStarted));
    }
}
