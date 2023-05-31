package com.patterns;


import com.patterns.abstractFactory.AbstractFactoryRunnable;
import com.patterns.command.CommandRunnable;
import com.patterns.decorator.DecoratorRunnable;
import com.patterns.proxy.ProxyRunnable;
import com.patterns.singlton.SingltonRunnable;
import com.patterns.snapshot.SnapshotRunnable;

public class Main {
    public static void main(String[] args) {
        Runnable.go(
                AbstractFactoryRunnable.class,
                SingltonRunnable.class,
                DecoratorRunnable.class,
                ProxyRunnable.class,
                SnapshotRunnable.class,
                CommandRunnable.class
        );
    }
}
