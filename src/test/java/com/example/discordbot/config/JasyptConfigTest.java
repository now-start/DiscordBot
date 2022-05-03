package com.example.discordbot.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.*;

class JasyptConfigTest {

    @Test
    public void jasyptTest() throws Exception {
        StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
        enc.setPassword("");

        //암호화
        String secret = "";
        System.out.println("암호화 : " + enc.encrypt(secret));
        System.out.println("복호화 : " + enc.decrypt(enc.encrypt(secret)));
    }
}