package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeList()
	{
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeDetails(int id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public Employee createORUpdateEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}

	public String deleteEmployeeDetails(int id)
	{
		employeeRepository.deleteById(id);
		
		return "successfully deleted.";
	}
}
