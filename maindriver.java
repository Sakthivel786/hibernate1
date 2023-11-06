package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class maindriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Person person=new Person();
		person.setAge(22);
		person.setGender("male");
		person.setName("ajith");
	
		Pancard card=new Pancard();
		card.setAddress("chennai");
		card.setDOB("12.1.2003");
		card.setPhone(385843355);
		card.setPno("ADSDDF34324");
	
		card.setPerson(person);
		person.setPan(card);
		
		et.begin();
		em.persist(card);
		em.persist(person);
		et.commit();
		System.out.println("database created");
		
		
		
	}

}
