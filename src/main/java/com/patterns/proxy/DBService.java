package com.patterns.proxy;

public interface DBService {
    User getUser();
    void connection();
    void execute(String query);
}
