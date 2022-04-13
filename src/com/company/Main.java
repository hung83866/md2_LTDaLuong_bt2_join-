package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread t1 = new Thread(oddThread);
        Thread t2 = new Thread(evenThread);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
