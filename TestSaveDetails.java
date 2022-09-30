package com.ty.personpan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person =new Person();
		person.setName("Dimple");
		person.setGender("Gender");
		Pan pan=new Pan();
		pan.setNumber("PKC76011");
		pan.setType("Business");
		
		 person.setRef(pan);
		 
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		/*//
		Person person1=entityManager.find(Person.class,1);
		System.out.println("...............PersonInfo");
		System.out.println("...............PersonInfo"+person.getId());
		System.out.println("...............PersonInfo"+person.getName());
		System.out.println("...............PersonInfo"+person.getGender());
		//
		Pan pan1=person.getRef();
		System.out.println("...............PanInfo.............");
		System.out.println("Pan ID :"+pan.getId());
		System.out.println("Pan Number :"+pan.getNumber());
		System.out.println("Pan Type :"+pan.getType());
		
		*/
		

	}

}
