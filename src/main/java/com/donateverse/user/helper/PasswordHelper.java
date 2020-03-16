package com.donateverse.user.helper;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordHelper {

    private static String salt = BCrypt.gensalt(12);

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, salt);
    }

    public static boolean checkPassword(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
