package com.flp.ems.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.HashMap;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.flp.ems.domain.Employee;

@Controller
public class MyController {
	
	
	static TreeSet<Integer> idset = new TreeSet<Integer>();
	
    
 
	
	@Autowired
	IemployeeDao eref;

	
	@ModelAttribute("employee")
	public Employee getEmployee(){
		return new Employee();
	}
	
	@RequestMapping("/index")
	public String welcome() {
	  return "index";
	 }
	
	
	@RequestMapping("/addEmployee")
	public String AddEmployee(ModelMap map,@RequestParam(value="id",required=false) String Sid)
	{
			if(Sid != null){
			map.put("id",Sid);
			}
			map.put("deps",getAllDepartments());
			map.put("roles",getAllroles());
			map.put("employee", new Employee());
			return "addEmployee";
	}
	@RequestMapping("/updateEmployee")
	public String UpdateEmployee(ModelMap map,@RequestParam(value="id") String Sid)
	{
		int id = Integer.parseInt(Sid);
		Employee emp= eref.findById(id);
		map.put("deps",getAllDepartments());
		map.put("roles",getAllroles());
		map.addAttribute("id",id);
		map.addAttribute("emp",emp);
		return "updateEmployee";
		
	}
	@RequestMapping(value={"/submitEmployee","updateEmployeeData"})
	public String AddEmployee(@ModelAttribute("employee") Employee employee, ModelMap map,@RequestParam(value="id",required=false) String sid)
	{
		//List<Employee> employees = eref.findAll();
		//employees.add(employee);
		if(sid!=null)
		{
			/*int id=Integer.parseInt(sid);
			employee.setKin_id(id);*/
			eref.editEmployee(employee);
		}
		else
		{
		idset.add(employee.getKin_id());
		eref.addEmployee(employee);
		}
		List<Employee> employees = eref.findAll();
		map.addAttribute("employees",employees);
		return "ListEmployee";
	}
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("id") String id, ModelMap map)
	{
		System.out.println("IN DELETE EMPLOYEE");
		eref.delete(id);
		idset.remove(Integer.parseInt(id));
		List<Employee> employees = eref.findAll();
		map.addAttribute("employees",employees);
		return "ListEmployee";
	}
	@RequestMapping("/listEmployee")
	public String listEmployee(ModelMap map)
	{
		//System.out.println("IN DELETE EMPLOYEE");
		//eref.delete(id);
		List<Employee> employees = eref.findAll();
		map.addAttribute("employees",employees);
		return "ListEmployee";
	}
	@RequestMapping("/search")
	public String search(ModelMap map)
	{
			/*List<Employee> employees = eref.findAll();
			map.addAttribute("employees",employees);*/
			return "EnterSearchKey";
	}
	@RequestMapping("/searchEmployee")
	public String searchEmployee(@RequestParam(value="id",required=false) String sid,@RequestParam(value="name",required=false) String name,@RequestParam(value="email_id",required=false) String email_id,ModelMap map)
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(email_id);
		if(!name.equals(""))
		{
			List<Employee> emp = eref.findByName(name);
			map.addAttribute("emps",emp);
		}
		else
		{
		int id = Integer.parseInt(sid);
		Employee emp = eref.findById(id);
		map.addAttribute("emp",emp);
		}
		return "DisplaySearch";
	
	
}
	
	public List<Integer> getAllDepartments(){
		List<Integer> departs = new ArrayList<Integer>();
		departs.add(1234);
		departs.add(4567);
		departs.add(7890);
		return departs;
	}
	public List<Integer> getAllroles(){
		List<Integer> departs = new ArrayList<Integer>();
		departs.add(123);
		departs.add(456);
		departs.add(789);
		return departs;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}