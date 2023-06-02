package com.patterns;

public abstract class AbstractRunnable
        implements Runnable {

    @Override
    public void before() {}
    @Override
    public void after() { System.out.println("--------------------------------------"); }
}
