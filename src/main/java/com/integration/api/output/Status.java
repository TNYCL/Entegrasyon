package com.integration.api.output;

public enum Status {

    NONE(0, true),
    SUCCESS(1, false),
    ERROR(2, true);

    private final int statusCode;
    private final boolean error;

    Status(int statusCode, boolean error) {
        this.statusCode = statusCode;
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public boolean isError() {
        return error;
    }
}
