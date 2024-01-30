package com.employee.backend.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
