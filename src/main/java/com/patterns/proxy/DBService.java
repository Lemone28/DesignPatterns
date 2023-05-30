package com.patterns.proxy;

public interface DBService {
    void connection();
    void execute(String query);
}
