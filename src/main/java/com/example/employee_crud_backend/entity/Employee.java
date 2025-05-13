package com.example.employee_crud_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key
    private Long id;

    private String name;
    private String email;
    private String position;
}
