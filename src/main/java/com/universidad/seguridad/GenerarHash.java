package com.universidad.seguridad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class GenerarHash {

    @Autowired
    private PasswordEncoder encoder;

    @Test
    void generar() {
        String hash = encoder.encode("admin123");
        System.out.println(hash);
    }
}