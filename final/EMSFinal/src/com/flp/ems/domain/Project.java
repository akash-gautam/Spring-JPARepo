package com.flp.ems.domain;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Project")
public class Project {
	
	@Id
	@Column(name = "Project_id")
	private int Project_id;
	@Column(name = "Name")
	private String Name;
	public int getProject_id() {
		return this.Project_id;
	}

	public void setProject_id(int project_id) {
		Project_id = project_id;
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

	public int getDepartment_id() {
		return this.Department_id;
	}

	public void setDepartment_id(int department_id) {
		Department_id = department_id;
	}

	@Column(name = "Description")
	private String Description;
	@Column(name = "Department_id")
	private int Department_id;
	
	static HashMap<Integer,Project> ProjectMap = new  HashMap<Integer,Project>();
	public Project setProject(int id, int Department_id, int Project_id)
	{
		
		
		if( Project_id == 4321 || Project_id == 3321 )
		{
			this.Project_id = Project_id;
			this.Name = "Housing Loan Management System For HSBC  ";
			this.Description = "This Project aims to create a Loan Management System for"
					+ "HSBC";
			this.Department_id = Department_id;
		}
		if(Project_id == 7654 || Project_id == 6654)
		{
			this.Project_id = Project_id;
			this.Name = "Cloud Based apps for Cutomor Management";
			this.Description = "This Project aims to create Cloud Based applivation for "
					+ "Customer record maintanance";
			this.Department_id = Department_id;		}
		if(Project_id == 2987 || Project_id == 1987)
		{
			this.Project_id = Project_id;
			this.Name = "TESTING AND MAINTANCE";
			this.Description = "THIS PROJECTS PERFORMS THE TESTING OF THE LATEST SOFTWARES";
			this.Department_id = Department_id;
			
		}
		ProjectMap.put(id,this);
		return (this);
		
}
	
	public void getProject(int id)
	{
		System.out.println("project Details for " +id+" "+ProjectMap.get(id));
		
	}

	@Override
	public String toString() {
		return "Project [Project_id=" + Project_id + ", Name=" + Name + ", Description=" + Description
				+ ", Department_id=" + Department_id + "]";
	}
	
	public void modifyProject(int id,int did,int pid)
	{
		//Project temp = new Project();
		Project temp2 = new Project();
		//temp = ProjectMap.get(id);
		this.Project_id = pid;
		this.Project_id = did;
		temp2 = ProjectMap.get(id);
		ProjectMap.remove(id,temp2);
		ProjectMap.put(id,this);
	}
	
	
	
	
	
}
