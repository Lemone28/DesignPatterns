package com.patterns.proxy;

public class User {
    private final String username;
    private final String password;
    private final AccessLevel accessLevel;

    public User(String username, String password, AccessLevel accessLevel) {
        this.username = username;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public AccessLevel getAccessLevel() { return accessLevel; }
}
