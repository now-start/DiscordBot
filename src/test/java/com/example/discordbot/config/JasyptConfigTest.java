package com.example.discordbot.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JasyptConfigTest {

    @Value("${jasypt.encryptor.password}")
    private String password = "2691";

    @Test
    public void jasyptTest() throws Exception {
        StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
        enc.setPassword(password);

        //암호화
        String secret = "DFyt5Z2LL4A7u97GyRXO39BKQrjegsj8hYtGVogb4CFmIRUPDmk/C+GoNlVlEOCDRWSq37E+A63jS/Z2RYVBGKxJ8LYbSQw1K6GynF0to3A=";
//        System.out.println("암호화 : " + enc.encrypt(secret));
        System.out.println("복호화 : " + enc.decrypt(secret));
    }
}