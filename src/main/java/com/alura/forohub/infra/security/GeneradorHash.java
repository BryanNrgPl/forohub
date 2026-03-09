package com.alura.forohub.infra.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneradorHash {
    public static void main(String[] args) {
        String password = "1234567";
        System.out.println(new BCryptPasswordEncoder().encode(password));
    }
}