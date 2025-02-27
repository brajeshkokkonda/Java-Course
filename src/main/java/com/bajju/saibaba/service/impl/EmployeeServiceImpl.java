package com.bajju.saibaba.service.impl;

import com.bajju.saibaba.dto.EmployeeDto;
import com.bajju.saibaba.entity.Employee;
import com.bajju.saibaba.mapper.EmployeeMapper;
import com.bajju.saibaba.repository.EmployeeRepository;
import com.bajju.saibaba.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
