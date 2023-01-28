package com.threads;
//note: CountDownLatch is used to make sure that a task waits for threads before they start
import java.util.concurrent.CountDownLatch;

public class CountDownLatch1 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        AssignTaskThread team1 = new AssignTaskThread(10000, latch, "Team-1");
        AssignTaskThread team2 = new AssignTaskThread(20000, latch, "Team-2");
        AssignTaskThread team3 = new AssignTaskThread(30000, latch, "Team-3");
        AssignTaskThread team4 = new AssignTaskThread(40000, latch, "Team-4");

        team1.start();
        team2.start();
        team3.start();
        team4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" has finished");
        System.out.println("Code is ready to be submitted to QA team");
    }
}

class AssignTaskThread extends Thread{
    private int delay;
    private CountDownLatch latch;
    public AssignTaskThread(int delay, CountDownLatch latch,  String name){
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            //There will be some task for the team
            System.out.println(Thread.currentThread().getName()+" finished");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        latch.countDown();
    }
}
