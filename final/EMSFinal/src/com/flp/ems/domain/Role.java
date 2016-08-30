package com.flp.ems.domain;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Role")
public class Role {

	public int getRole_id() {
		return this.Role_id;
	}
	public void setRole_id(int role_id) {
		Role_id = role_id;
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




				@Id
				@Column(name = "Role_id")
				private int Role_id;
				@Column(name = "Name")
				private String Name;
				@Column(name = "Description")
				private String Description;
				static HashMap<Integer,Role> RoleMap = new  HashMap<Integer,Role>();
				
				public Role setRole(int id, int Role_id)
				{
					if( Role_id == 123 )
					{
						this.Role_id = Role_id;
						this.Name = "SOFTWARE ENGINEER";
						this.Description = "This IS A DEVEOPER ROLE WHO WRITES THE CODES ";
					}
					if( Role_id == 456)
					{
						this.Role_id = Role_id;
						this.Name = "TESTER";
						this.Description = "ThIS IS THE TESTER JOB WHO PERFORMS THE TESTING POST PROJECT COMPLETION";
					}
					if(Role_id == 789)
					{
						this.Role_id = Role_id;
						this.Name = "ARCHITECT";
						this.Description = "THIS ROLE IS ABOUT DESIGNING THE HIGH LEVEL ARCHITECTER OF THE PROJECT";
					}
					RoleMap.put(id,this);
					return this; 
					
				}
				public void getRole(int id){
					
					System.out.println("Deaprtment Details for " +id+" "+RoleMap.get(id));
					
                                     }
				@Override
				public String toString() {
					return "Role [Role_id=" + Role_id + ", Name=" + Name + ", Description=" + Description + "]";
				}
					
					
			   
				
       public void modifyRole(int id,int pid)
       {
    	   Role temp = new Role();
    	   Role temp2 = new Role();
    	   temp = RoleMap.get(id);
    	   temp.Role_id = pid;
    	   temp2 = RoleMap.get(id);
    	   RoleMap.remove(id,temp2);
    	   RoleMap.put(id,temp);
}










       }


