package com.bajju.saibaba.service;

import com.bajju.saibaba.dto.EmployeeDto;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
