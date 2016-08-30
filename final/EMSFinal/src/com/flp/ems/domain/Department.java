package com.flp.ems.domain;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Department")
public class Department {

	@Id
    @Column(name = "Department_id")
	private int Department_id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Description")
	private String Description;
	public int getDepartment_id() {
		return this.Department_id;
	}
	public void setDepartment_id(int department_id) {
		Department_id = department_id;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return this.Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	static HashMap<Integer,Department> DepartmentMap = new  HashMap<Integer,Department>();
	
	public Department setDepartment(int id, int Department_id)
	{
		if(Department_id == 1234)
		{
			this.Department_id = Department_id;
			this.Name = "FINANACIAL SERVICES";
			this.Description = "This department deals with banking and insurance services";
			
		}
		if(Department_id == 4567)
		{
			this.Department_id = Department_id;
			this.Name = "CLOUD SERVICES";
			this.Description = "This department Helps in cloud deployment and maintanance";
			
		}
		if(Department_id == 7890)
		{
			this.Department_id = Department_id;
			this.Name = "TESTING AND MAINTANANCE";
			this.Description = "THIS DEPARTMENT DEALS WITH TECTING AND MAINTANACE";
			
		}
		DepartmentMap.put(id,this);
		return (this);
}
	public void getDepartment(int id)
	{
		System.out.println("Deaprtment Details for " +id+" "+DepartmentMap.get(id));
		
	}
	@Override
	public String toString() {
		return "Department [Department_id=" + Department_id + ", Name=" + Name + ", Description=" + Description + "]";
	}
	public void modifyDepartment(int id,int did)
	{
		Department temp = new Department();
		Department temp2 = new Department();
		temp = DepartmentMap.get(id);
		temp.Department_id = did;
		temp2 = DepartmentMap.get(id);
		DepartmentMap.remove(id,temp2);
		DepartmentMap.put(id,temp);
	}
	
	
	


















}
