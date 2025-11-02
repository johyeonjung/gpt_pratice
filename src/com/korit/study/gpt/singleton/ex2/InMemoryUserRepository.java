package com.korit.study.gpt.singleton.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryUserRepository implements UserRepository {

    private static final InMemoryUserRepository instance = new InMemoryUserRepository();
    private final Map<String,User> users = new ConcurrentHashMap<>();

    private InMemoryUserRepository() {
    }
    public static InMemoryUserRepository getInstance() {
        return instance;
    }
    public void save(User user) {
        users.put(user.getUsername(),user);

    }
    public User findByUsername(String Username) {
       User result =  users.get(Username);
       if (result == null) {
           return null;
       } else {
           return result;
       }

    }

    public boolean existsByUsername(String username) {
        if (users.containsKey(username)) {
            return true;
        } else {
            return false;
        }
    }
}
