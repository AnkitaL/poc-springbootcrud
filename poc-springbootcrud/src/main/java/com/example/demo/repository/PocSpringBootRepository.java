package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface PocSpringBootRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByName(String name);

	List<Employee> findByIdGreaterThan(int id);

	@Query("from Employee where name=?1 order by company_name desc")
	List<Employee> findByNameSorted(String name);

}
