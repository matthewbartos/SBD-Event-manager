package com.mateuszbartos.controllers;

public class DatabaseProvider {
    private static Database INSTANCE;

    public static Database get() {
        if (INSTANCE == null) {
            INSTANCE = new Database();
        }
        return INSTANCE;
    }
}
