package com.web.start.poupmoney.api.poupmoney.services.exceptionCustonService;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataException extends DataIntegrityViolationException {
    
    public DataException(String message) {
        super(message);
    }

}

