package com.pranav.springjpa;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");
    	EntityManager em=emf.createEntityManager();
    	
    	Student s =em.find(Student.class, 1);
    	
        System.out.println( "Hello World!" );
    }
}
