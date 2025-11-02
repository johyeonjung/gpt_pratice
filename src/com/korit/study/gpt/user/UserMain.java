package com.korit.study.gpt.user;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("email");
        user.setUsername("username");
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
    }
}
