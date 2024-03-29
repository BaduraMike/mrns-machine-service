package com.soft.mikessolutions.machineservice.advices;

import com.soft.mikessolutions.machineservice.exceptions.MachineNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MachineNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(MachineNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String machineNotFoundHandler(MachineNotFoundException ex) {
        return ex.getMessage();
    }
}
