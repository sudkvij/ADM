package com.hcl.dna.mad.employee.dao;

import com.hcl.dna.mad.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}
