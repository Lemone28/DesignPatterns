package com.patterns.proxy;

import com.patterns.AbstractRunnable;

public class ProxyRunnable extends AbstractRunnable {
    public void run() {
        User user1 = new User("Tom", "12345", AccessLevel.USER);
        User user2 = new User("Jack", "qwerty", AccessLevel.SUPER_ADMIN);

        DBService proxyWithUser = new DBServiceAuthorizationProxy(user1);
        DBService proxyWithSuperAdmin = new DBServiceAuthorizationProxy(user2);

        proxyWithUser.connection();
        proxyWithUser.execute("command");

        proxyWithSuperAdmin.connection();
        proxyWithSuperAdmin.execute("command");
    }
}
