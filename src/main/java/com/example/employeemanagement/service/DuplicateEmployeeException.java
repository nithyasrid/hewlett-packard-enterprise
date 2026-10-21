package com.example.employeemanagement.service;

public class DuplicateEmployeeException extends RuntimeException {
    public DuplicateEmployeeException(String message) { super(message); }
}
