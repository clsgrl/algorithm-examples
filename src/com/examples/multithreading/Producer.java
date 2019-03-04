package com.examples.multithreading;

import java.util.concurrent.BlockingQueue;

/**
 * Created by gabriele on 25/02/18.
 */
public class Producer implements Runnable{

    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
