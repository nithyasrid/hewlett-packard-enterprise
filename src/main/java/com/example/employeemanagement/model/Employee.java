package com.example.employeemanagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Employee {
    @NotBlank(message = "employeeId is required")
    private String employeeId;
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "department is required")
    private String department;
    @NotNull(message = "salary is required")
    @Positive(message = "salary must be greater than zero")
    private Double salary;

    public Employee() {}
    public Employee(String employeeId, String name, String department, Double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
}
