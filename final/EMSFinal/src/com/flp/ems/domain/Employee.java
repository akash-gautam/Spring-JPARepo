package com.flp.ems.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Entity
@Table(name = "Employee")
public class Employee {

	      @Id
	      @Column(name = "Kin_id")
	      private int Kin_id;
	      @Column(name = "Name")
	      private String Name;
	      @Column(name = "Email_id")
	      private String Email_id;
	      @Column(name = "Phone_no")
	      private String Phone_no;
	      @Temporal(TemporalType.DATE)
	      @Column(name = "Dob")
	      private Date Dob;
	      @Temporal(TemporalType.DATE)
	      @Column(name = "Doj")
	      private Date Doj;
	      @Column(name = "Address")
	      private String Address;
	      @Column(name = "Department_id")
	      private int Department_id;
	      @Column(name = "Project_id")
	      private int Project_id;
	      @Column(name = "Role_id")
	      private int Role_id;
	      
	    public Employee setEmployee(int Kin_Id,String Name,String Email_Id, String Phone_no, Date Dob, Date Doj,
	    	String Address, int Department_id,int Project_id,int Role_id )
	      {
	    	setKin_id(Kin_id);
	    	setName(Name);
	    	setEmail_id(Email_id);
	    	setPhone_no(Phone_no);
	    	setDob(Dob);
	    	setDoj(Doj);
	    	setAddress(Address);
	    	setDepartment_id(Department_id);
	    	setProject_id(Project_id);
	    	setRole_id(Role_id);
	    	return (this);
	    }
	     
	    public String getName() {
			return Name;
		}

		public void setName(String Name) {
			this.Name = Name;
		}

		public int getKin_id() {
			return Kin_id;
		}

		public void setKin_id(int Kin_id) {
			this.Kin_id = Kin_id;
		}

		public String getEmail_id() {
			return Email_id;
		}

		public void setEmail_id(String Email_id) {
			this.Email_id = Email_id;
		}

		public String getPhone_no() {
			return Phone_no;
		}

		public void setPhone_no(String Phone_no) {
			this.Phone_no = Phone_no;
		}

		public Date getDob() {
			return Dob;
		}

		public void setDob(Date Dob) {
			this.Dob = Dob;
		}

		public Date getDoj() {
			return Doj;
		}

		public void setDoj(Date Doj) {
			this.Doj = Doj;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String Address) {
			this.Address = Address;
		}
		public void setDepartment_id(int Department_id) {
			this.Department_id = Department_id;
		}
		public int getDepartment_id() {
			return this.Department_id;
		}
		public void setProject_id(int Project_id) {
			this.Project_id = Project_id;
		}
		public int getProject_id() {
			return this.Project_id;
		}
		public void setRole_id(int Role_id) {
			this.Role_id = Role_id;
		}
		public int getRole_id() {
			return this.Role_id;
		}
	      public Employee getEmployee()
	      {
	    	getKin_id();
	  		getName();
	  		getEmail_id();
	  		getPhone_no();
	  		getDob();
	  		getDoj();
	  		getAddress();
	  		return (this); 
	    }  	  
	    
	    
	      @Override
		public String toString() {
			return "Employee [Name=" + this.Name + ", Kin_Id=" + this.Kin_id + ",Email_Id=" + this.Email_id + ", Phone_no=" + this.Phone_no
					+ ", Dob=" +this.Dob + ", Doj=" + this.Doj + ", Address=" + this.Address + ", Department_id=" + this.Department_id
					+ ", Project_id=" + this.Project_id + ", Role_id=" + this.Role_id + "]";
		}

		public boolean equals(int id)
	      {
	    	  if( this.Kin_id == id )
	    		  return true;
	    	  else
	    		   return false;
	      }
	      public boolean equalsEid(String id)
	      {
	    	  if( this.Email_id.equals(id) )
	    		  return true;
	    	  else
	    		   return false;
	      }
	      public boolean equalsName(String id)
	      {
	    	  if( this.Name.equals(id) )
	    		  return true;
	    	  else
	    		   return false;
	      }
	    	  
	    	  
	    	  
	   
	      
	      
	                  }
