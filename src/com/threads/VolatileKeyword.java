package com.threads;

public class VolatileKeyword {
    private static volatile int counter = 0;
    public static void main(String[] args) {

        Thread threa1 = new Thread(()->{

            int local_counter = counter;
            while(local_counter<10){
                if(local_counter!=counter){
                    System.out.println("[T1] Local counter is changed....");
                    local_counter=counter;
                }
            }

        });

        Thread threa2 = new Thread(()->{
            int local_counter = counter;
            while(local_counter<10){
                System.out.println("[T2] Incremented counter to "+(local_counter+1));
                counter=++local_counter;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        threa1.start();
        threa2.start();


    }
}
