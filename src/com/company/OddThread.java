package com.company;

public class OddThread implements Runnable {
    private Thread t;

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {

                if (i % 2 != 0) {
                    System.out.println("số lẻ = "+i);
                    Thread.sleep(100);
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
