package com.maktabsharif.exception;

public class EmptyDBException extends RuntimeException{

    public EmptyDBException(String message) {
        super(message);
    }
    
}
