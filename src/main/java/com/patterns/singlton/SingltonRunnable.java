package com.patterns.singlton;

import com.patterns.AbstractRunnable;

public class SingltonRunnable extends AbstractRunnable {
    @Override
    public void run() {
        System.out.println(FileReader.getInstance().getContent());
    }
}
