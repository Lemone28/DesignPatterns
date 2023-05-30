package com.patterns.proxy;

public class AppDBService implements DBService {
    private final User user;
    private boolean isConnected;

    public AppDBService(User user) {
        this.user = user;
        this.isConnected = false;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void connection() {
        isConnected = true;
        System.out.println("Підключення встановлено");
    }

    @Override
    public void execute(String query) {
        if (isConnected) {
            System.out.println("Запит виконався успішно");
        } else {
            System.out.println("Немає підключення до бази даних");
        }
    }
}
