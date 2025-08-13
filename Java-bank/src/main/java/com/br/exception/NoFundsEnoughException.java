package com.br.exception;

public class NoFundsEnoughException extends RuntimeException {

    public NoFundsEnoughException(String message) {
        super(message);
    }

}