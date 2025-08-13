package com.br.exception;


public class PixInUseException extends RuntimeException {

    public PixInUseException(String message) {
        super(message);
    }

}