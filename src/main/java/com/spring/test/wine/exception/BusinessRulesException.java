package com.spring.test.wine.exception;

// Pode ser melhorado criando um Interceptor (ExceptionHandler) para capturar
// as exceções de API e enviar uma msg amigável para o font
public class BusinessRulesException extends RuntimeException {
    public BusinessRulesException(String message) {
        super(message);
    }

    public BusinessRulesException(String message, Throwable cause) {
        super(message, cause);
    }
}
