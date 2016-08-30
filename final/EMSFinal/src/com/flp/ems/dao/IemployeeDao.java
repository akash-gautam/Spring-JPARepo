package com.flp.ems.dao;
import java.util.List;

import javax.persistence.Query;
import com.flp.ems.domain.*;
public interface IemployeeDao {
	
	public void addEmployee(Employee employee);
	public void editEmployee(Employee employee);
	public List<Employee> findAll();
	public void delete(String id);
	public Employee findById(int id);
	public List<Employee> findByName(String name);

							}
