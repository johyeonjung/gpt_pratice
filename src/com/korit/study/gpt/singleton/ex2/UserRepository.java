package com.korit.study.gpt.singleton.ex2;

public interface UserRepository {
    boolean existsByUsername(String username);
    void save(User user);

    User findByUsername(String username);

}
