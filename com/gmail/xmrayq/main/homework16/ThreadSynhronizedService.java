package com.gmail.xmrayq.main.homework16;

import java.util.Date;

public class ThreadSynhronizedService extends Thread {

    private SynhronizeService synhronizeService;

    public ThreadSynhronizedService(SynhronizeService synhronizeService) {
        this.synhronizeService = synhronizeService;
    }

    @Override
    public void run() {

        synhronizeService.synhronizedTime();
    }
}

class SynhronizeService {

    public synchronized void synhronizedTime() {
        Date date = new Date();
        System.out.println(Thread.currentThread().getName() + " Current time:  " + date.toString());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
