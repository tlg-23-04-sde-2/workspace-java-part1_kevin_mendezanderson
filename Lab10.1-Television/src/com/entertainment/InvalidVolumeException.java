package com.entertainment;

public class InvalidVolumeException extends Exception {
    //Application-specific custom exception class - CHECKED EXCEPTION.

    public InvalidVolumeException() {
    }

    public InvalidVolumeException(String message) {
        super(message);
    }

    public InvalidVolumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVolumeException(Throwable cause) {
        super(cause);
    }
}