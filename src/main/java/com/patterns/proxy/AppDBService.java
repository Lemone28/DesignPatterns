package com.patterns.proxy;

public class AppDBService implements DBService {
    private final User user;
    private boolean isConnected;

    public AppDBService(User user) {
        this.user = user;
        this.isConnected = false;
    }

    @Override
    public void connection() {
        isConnected = true;
        System.out.println("Підключення встановлено");
    }

    @Override
    public void execute(String query) {
        System.out.println("Запит виконався успішно");
    }
}
