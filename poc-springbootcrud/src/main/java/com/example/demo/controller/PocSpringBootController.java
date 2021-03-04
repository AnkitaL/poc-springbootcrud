package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.PocSpringBootRepository;

@RestController
public class PocSpringBootController {

	
	@Autowired
	PocSpringBootRepository pocRepository;
	
	@RequestMapping("/home")
	public String home(HttpServletRequest re) {
		System.out.println("homeee calling"+re.getParameter("name"));
		
		return "home.jsp";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return pocRepository.findAll();
	}
	
	@RequestMapping("/employees/{eid}")
	public Optional<Employee> getById(@PathVariable("eid") int id) {
		return pocRepository.findById(id);
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee){
		pocRepository.save(employee);
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee saveOrUpdateEmployee(@RequestBody Employee employee){
		pocRepository.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{eid}")
	public String deleteEmployee(@PathVariable("eid") int id) {
		Employee e = pocRepository.getOne(id);
		pocRepository.delete(e);
		return "deleted";
		
	}
}
