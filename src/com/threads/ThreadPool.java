package com.threads;
//When using the threads in a program, it is costly to recreate thread each time
//howvever, we can make a thread pool and take it from the pool depending on need
//After using thread you can put thread in to pool again
//in Executors.newFixedThreadPool method by changing parameter we can change how man thread you need in pool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() );
        ThreadCreater thread1 = new ThreadCreater("Thread1");
        ThreadCreater thread2 = new ThreadCreater("Thread2");
        ThreadCreater thread3 = new ThreadCreater("Thread3");
        ThreadCreater thread4 = new ThreadCreater("Thread4");
        ThreadCreater thread5 = new ThreadCreater("Thread5");
        ThreadCreater thread6 = new ThreadCreater("Thread6");
        ThreadCreater thread7 = new ThreadCreater("Thread7");
        ThreadCreater thread8 = new ThreadCreater("Thread8");
        ThreadCreater thread9 = new ThreadCreater("Thread9");
        ThreadCreater thread10 = new ThreadCreater("Thread10");

//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();
//        thread9.start();
//        thread10.start();
        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);
        service.execute(thread6);
        service.execute(thread7);
        service.execute(thread8);
        service.execute(thread9);
        service.execute(thread10);

        service.shutdown();


    }
}
class ThreadCreater extends Thread{
    private String threadName;
    public ThreadCreater(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName+" Thread started to run");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName+" Thread stopped to run");
    }
}
