package com.cg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class InheritanceTest 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("raj");
		employee.setSalary(5400);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("akash");
		manager.setSalary(4000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}

}
