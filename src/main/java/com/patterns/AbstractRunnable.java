package com.patterns;

public abstract class AbstractRunnable
        implements Runnable {
    public static void run(Runnable runnable) {
        runnable.before();
        runnable.run();
        runnable.after();
    }

    @Override
    public void before() {}
    @Override
    public void after() { System.out.print("\n\n"); }
}
