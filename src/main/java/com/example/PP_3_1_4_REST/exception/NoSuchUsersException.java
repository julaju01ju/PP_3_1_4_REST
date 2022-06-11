package com.example.PP_3_1_4_REST.exception;

public class NoSuchUsersException extends RuntimeException {
    public NoSuchUsersException(String message) {
        super(message);
    }
}