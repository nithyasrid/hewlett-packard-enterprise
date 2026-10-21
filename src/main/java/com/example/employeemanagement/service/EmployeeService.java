package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class EmployeeService {
    private final List<Employee> employees = new CopyOnWriteArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("EMP101", "Ananya Rao", "Engineering", 55000.0));
        employees.add(new Employee("EMP102", "Rahul Kumar", "Finance", 48000.0));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    public Employee addEmployee(Employee employee) {
        boolean duplicate = employees.stream().anyMatch(existing ->
                existing.getEmployeeId().equalsIgnoreCase(employee.getEmployeeId()));
        if (duplicate) {
            throw new DuplicateEmployeeException("An employee with ID " + employee.getEmployeeId() + " already exists");
        }
        employees.add(employee);
        return employee;
    }
}
