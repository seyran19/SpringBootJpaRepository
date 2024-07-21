package com.seirandzhafarov.springboot.service;


import com.seirandzhafarov.springboot.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public  Employee getEmployeeById(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllEmployeesByName(String name);

}