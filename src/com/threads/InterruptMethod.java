package com.threads;

public class InterruptMethod {
    public static int balance = 0;
    public static void main(String[] args) {
        WaitNotify obj = new WaitNotify();
        Thread withdrawThead = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(800);
            }
        });
        Thread depositThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(2000);
                withdrawThead.interrupt();

            }
        });
        withdrawThead.start();
        depositThread.start();

    }
    public void withdraw(int amount){
        synchronized (this){
            if(balance <=0 || balance<amount){
                System.out.println("Waiting for the deposit to update...");
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("This thread is interrupted");
                }

            }
        }
        balance = balance - amount;
        System.out.println("Withdraw is successful. The current balance is: "+balance );
    }
    public void deposit(int amount){
        balance =balance+amount;
        System.out.println("The amount is deposited. The current balance is: "+balance);

    }
}
