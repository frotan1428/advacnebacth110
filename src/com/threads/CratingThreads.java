package com.threads;
//Note: If you call run() method you just call the run method it will not start the thread

class MyTask{

    void executeTask(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 2 is working..#"+i);
        }
    }

}

//1st Way of Creating Thread
class MyTaskWithThread extends Thread{
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
//2nd way of creating Thread
class MyTaskWithThread02 extends MyTask implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 5 is working..#"+i);
        }
    }
}

public class CratingThreads {
    public static void main(String[] args) {
        //Whatever we write in here will be executed by main method
        //Job 3 will wait until job 2 to be completed, that is because if there is no thread used everything
        //work in sequential order

        //job:1
        System.out.println("======== Application Without Thread Started=========");
        //job:2
        MyTask myTask = new MyTask();
        myTask.executeTask();
        //job:3
        for(int i = 1; i<=10; i++){
            System.out.println("Printer 1 is working..#"+i);
        }
        //job:4
        System.out.println("======== Application Without Thread Ended=========");




        //job:1
        System.out.println("======== Application With Thread Started=========");
        //Now Job3 does not wait for job2 to be completed. They are being executed by the different threads
        //at the same time... so they are working concurrently.
        //job:2
        //creating object and starting thread
        MyTaskWithThread myTaskWithThread = new MyTaskWithThread();
        //start() method  initializes the run () internally
        myTaskWithThread.start();

        //creating object of thread creation 2nd way) and starting thread
        MyTaskWithThread02 myTaskWithThread02 = new MyTaskWithThread02();
        Thread thread = new Thread(myTaskWithThread02);
        thread.start();

        //3rd option to create thread
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is anonymous way of creating therad");
            }
        });
        thread3.start();

        //4th option to create thread: using lambda expression
        Thread thread4 = new Thread(()->{
            System.out.println("This is thread was created using lambda expression");
        });
        thread4.start();


        //job:3
        for(int i = 1; i<=10; i++){
            System.out.println("Printer 4 is working..#"+i);
        }
        //job:4
        System.out.println("======== Application With Thread Ended=========");
    }
}
