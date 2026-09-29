package org.example.microservice.exception;

public class PatientNotFoundException extends RuntimeException {

        public PatientNotFoundException(String message) {
            super(message);
        }
    }

