package com.example.employee_crud_backend.service;

import com.example.employee_crud_backend.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employee_crud_backend.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public Employee update(Long id, Employee emp) {
        Employee existing = repo.findById(id).orElseThrow();
        existing.setName(emp.getName());
        existing.setEmail(emp.getEmail());
        existing.setPosition(emp.getPosition());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

