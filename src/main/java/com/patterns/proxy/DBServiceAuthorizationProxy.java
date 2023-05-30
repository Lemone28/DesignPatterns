package com.patterns.proxy;

public class DBServiceAuthorizationProxy implements DBService {
    private static final AccessLevel AllowableAccessLevel = AccessLevel.SUPER_ADMIN;
    private DBService service;

    @Override
    public User getUser() {
        return service.getUser();
    }

    @Override
    public void connection() {
        if (authorization()) {
            service.connection();
        } else {
            System.out.println("Недостаньо прав для доступу");
        }
    }

    private boolean authorization() {
        if (service.getUser().getAccessLevel().compareTo(AllowableAccessLevel) < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void execute(String query) {
        service.execute(query);
    }
}
