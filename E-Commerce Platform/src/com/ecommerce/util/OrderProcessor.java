package com.ecommerce.util;

public class OrderProcessor extends Thread {
    private final Object lock;

    public OrderProcessor(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("OrderProcessor started by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // simulate processing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("OrderProcessor finished by " + Thread.currentThread().getName());
        }
    }
}
