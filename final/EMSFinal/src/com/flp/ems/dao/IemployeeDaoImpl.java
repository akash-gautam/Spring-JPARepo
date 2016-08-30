package com.flp.ems.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.flp.ems.domain.*;

@Repository
public class IemployeeDaoImpl implements IemployeeDao {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void addEmployee(Employee employee)
	{
		try{
			 int flag = 0;
		     Query query = entityManager.createQuery("select department from Department department");
			 List<Department> dlist = query.getResultList();
			 for(Department dept: dlist)
			 {
				 if(dept.getDepartment_id() == employee.getDepartment_id())
					 			flag=1;
				 
			 }
			 if(flag==0)
			 {
				 Department d = new Department();
			     d = d.setDepartment(employee.getKin_id(), employee.getDepartment_id());
			     entityManager.persist(d);
			 }
			 flag=0;
			 query = entityManager.createQuery("select project from Project project");
			 List<Project> plist = query.getResultList();
			 for(Project pro: plist)
			 {
				 if(pro.getProject_id() == employee.getProject_id())
					 			flag=1;
				 
			 }
			 if(flag==0)
			 {
				   Project p = new Project();
					p = p.setProject(employee.getKin_id(),employee.getDepartment_id(),employee.getProject_id());
					entityManager.persist(p);
			 }
			 flag=0;
			 query = entityManager.createQuery("select role from Role role");
			 List<Role> rlist = query.getResultList();
			 for(Role rol: rlist)
			 {
				 if(rol.getRole_id() == employee.getRole_id())
					 			flag=1;
				 
			 }
			 if(flag==0)
			 {
					Role r = new Role();
					r = r.setRole(employee.getKin_id(), employee.getRole_id());
					entityManager.persist(r);
			 }
			entityManager.persist(employee);
//			tx.commit();
			
			System.out.println("After commit .................");
			
		} catch (RuntimeException e) {
//			tx.rollback();
			throw e;
		} finally {
			entityManager.close();
		}
		return;
	}
	@Override
	public List<Employee> findAll() {
		
		try {
			Query query = entityManager.createQuery(
			"select employee from Employee employee");
			return query.getResultList();
		} finally {
		entityManager.close();
		}
	}
	@Override
	@Transactional
	public void delete(String id) {
		
		//EntityTransaction tx = entityManager.getTransaction();
		try {
				
				Employee employee = entityManager.find(Employee.class, Integer.parseInt(id));
				entityManager.remove(employee);
			//}
			
			//tx.commit();
		} catch (RuntimeException e) {
		//tx.rollback();
		throw e;
		} finally {
		entityManager.close();
		}		
	}
	@Override
	@Transactional
	public void editEmployee(Employee employee)
	{
			try{
				 int flag = 0;
			     Query query = entityManager.createQuery("select department from Department department");
				 List<Department> dlist = query.getResultList();
				 for(Department dept: dlist)
				 {
					 if(dept.getDepartment_id() == employee.getDepartment_id())
						 			flag=1;
					 
				 }
				 if(flag==0)
				 {
					 Department d = new Department();
				     d = d.setDepartment(employee.getKin_id(), employee.getDepartment_id());
				     entityManager.persist(d);
				 }
				 flag=0;
				 query = entityManager.createQuery("select project from Project project");
				 List<Project> plist = query.getResultList();
				 for(Project pro: plist)
				 {
					 if(pro.getProject_id() == employee.getProject_id())
						 			flag=1;
					 
				 }
				 if(flag==0)
				 {
					   Project p = new Project();
						p = p.setProject(employee.getKin_id(),employee.getDepartment_id(),employee.getProject_id());
						entityManager.persist(p);
				 }
				 flag=0;
				 query = entityManager.createQuery("select role from Role role");
				 List<Role> rlist = query.getResultList();
				 for(Role rol: rlist)
				 {
					 if(rol.getRole_id() == employee.getRole_id())
						 			flag=1;
					 
				 }
				 if(flag==0)
				 {
						Role r = new Role();
						r = r.setRole(employee.getKin_id(), employee.getRole_id());
						entityManager.persist(r);
				 }
			entityManager.merge(employee);
			
			System.out.println("After commit .................");
			
		} catch (RuntimeException e) {
//			tx.rollback();
			throw e;
		} finally {
			entityManager.close();
		}
	}
		
	@Override
	public Employee findById(int id) {
		
		Employee emp = (Employee) entityManager.find(Employee.class, id);
		return emp;
									}
		
public List<Employee> findByName(String name) {
		
	
			System.out.println("in search by name");
	
	try {
		Query query = entityManager.createQuery(
		"select employee from Employee employee where employee.Name=:name");
		query.setParameter("name",name);
		return query.getResultList();
	} finally {
	entityManager.close();
	}
	
	
	
									}
	
	
	
	
	
	
	
	
	
	
	
	}
	
		
		
		
		
		
		
		
	
	
	
	
