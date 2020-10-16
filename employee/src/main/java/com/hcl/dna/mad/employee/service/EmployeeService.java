package com.hcl.dna.mad.employee.service;

import com.hcl.dna.mad.employee.RecordNotFoundException;
import com.hcl.dna.mad.employee.dao.EmployeeDAO;
import com.hcl.dna.mad.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getEmployees() {
        final Iterable<Employee> allPractitioners = employeeDAO.findAll();
        List<Employee> list = StreamSupport
                .stream(allPractitioners.spliterator(), false)
                .collect(Collectors.toList());
        return list;
    }

    public Employee getEmployee(Long empId) {
        return this.employeeDAO.findById(empId).get();
    }

    public Employee createEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    public Employee updateEmployee(Employee employee) throws RecordNotFoundException {
        Optional<Employee> employeesExists = employeeDAO.findById(employee.getId());
        if (employeesExists.isPresent()) {
            Employee updEmployee = new Employee();
            updEmployee.setAddress1(employee.getAddress1());
            updEmployee.setFirstName(employee.getFirstName());
            updEmployee.setLastName(employee.getLastName());
            updEmployee = employeeDAO.save(updEmployee);
            return updEmployee;
        } else {
            throw new RecordNotFoundException("Employee Not Found");
        }
    }

    public void deleteEmployee(Long id) throws RecordNotFoundException {
        Optional<Employee> employeesExists = employeeDAO.findById(id);
        if (employeesExists.isPresent()) {
            employeeDAO.deleteById(id);
        } else {
            throw new RecordNotFoundException("Employee Not Found");
        }
    }
}
