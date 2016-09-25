package com.servicefuture.incidentservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by zhenjian on 2016/9/20.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    public NotFoundException(String id){
        super("Not found: " + id );
    }
}
