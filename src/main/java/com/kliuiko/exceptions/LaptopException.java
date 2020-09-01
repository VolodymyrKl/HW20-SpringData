package com.kliuiko.exceptions;

public class LaptopException extends RuntimeException {
    public LaptopException(long id) {
        super("Laptop with ID " + id + " not exist.");
    }
}
