package kz.assetbaitur.employeemanager.service;

import kz.assetbaitur.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee addEmployee(Employee employee);
    Employee getEmployee(Long id);
    void deleteEmployee(Long id);
    Employee saveEmployee(Employee employee);

}
