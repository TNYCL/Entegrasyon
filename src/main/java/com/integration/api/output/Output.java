package com.integration.api.output;

import lombok.Data;

@Data
public class Output {

    private int statusCode;
    private boolean error;
    private String message;

    public Output(Status status, String message) {
        this.statusCode = status.getStatusCode();
        this.error = status.isError();
        this.message = message;
    }

}
