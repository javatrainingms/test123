package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
public class EmployeeRestContoller {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getEmployeeList")
	public List<Employee> getEmployeeList()
	{
		return employeeService.getEmployeeList();
	}
	
	@GetMapping("getEmployeeDetails")
	public Employee getEmployeeDetails(@RequestParam("id") int id)
	{
		return employeeService.getEmployeeDetails(id);
	}
	
	@PostMapping("createEmployee")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return employeeService.createORUpdateEmployee(emp);
	}
	
	
	@PutMapping("updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return employeeService.createORUpdateEmployee(emp);
	}
	
	@DeleteMapping("deleteEmployee")
	public String deleteEmployee(@PathVariable("id") int id)
	{
		return employeeService.deleteEmployeeDetails(id);
	}

}
