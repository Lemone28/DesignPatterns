package com.patterns;

public interface Runnable {
    static void go(Class<? extends Runnable>... classes) {
        for (Class<? extends Runnable> clazz : classes) {
            try {
                Runnable runnable = clazz.getDeclaredConstructor().newInstance();
                runnable.before();
                runnable.run();
                runnable.after();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    void before();
    void run();
    void after();
}
