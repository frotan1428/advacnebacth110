package com.threads;

class Printer{
    //this 2 nd way of cynchronized thread
//    synchronized void printDocument(int numOfCopies, String docName){
     void printDocument(int numOfCopies, String docName){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 1; i<=numOfCopies; i++){
            System.out.println(">>Printing "+docName+" "+i);
        }
    }
}

class MyThread extends Thread{
    Printer printer;
    MyThread(Printer printer){
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (this.printer){
            printer.printDocument(10, "johnsdocument.pdf");
        }
    }
}

class YourThread extends Thread{
    Printer printer;
    YourThread(Printer printer){
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (this.printer){
            printer.printDocument(10, "kevinsDocument.pdf");
        }
    }
}

public class MultiThreading02 {
    public static void main(String[] args) {
        System.out.println("=====Application with thread started");
        Printer printer = new Printer();

        //Scenario is that we have multiple thread working on the same Printer object
        //If multiple thread are going to work on the same single object we must synchronize
        MyThread myThread = new MyThread(printer);
        YourThread yourThread = new YourThread(printer);

        myThread.start();

        //This is 1 st way to synchonize the threads
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        yourThread.start();

        System.out.println("=====Application with thread ended");

    }
}
