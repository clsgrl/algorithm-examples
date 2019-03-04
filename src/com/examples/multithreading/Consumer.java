package com.examples.multithreading;

import java.util.concurrent.BlockingQueue;

/**
 * Created by gabriele on 25/02/18.
 */
public class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
