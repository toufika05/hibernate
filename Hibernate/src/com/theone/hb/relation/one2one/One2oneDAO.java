package com.theone.hb.relation.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2oneDAO {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		    cfg.configure();
		
	   SessionFactory factory = cfg.buildSessionFactory();
                                                           
	       Session session = factory.openSession();
		        
		  Transaction transaction = session.beginTransaction();
		  
		  Country country=new Country();
		  country.setName("India");
		  
		  PrimeMinister minister=new  PrimeMinister();
		  minister.setName("Modi");
		  minister.setCountry(country);
		  
		  
		  session.save(minister);
		  transaction.commit();
		  
		  session.close();
		factory.close();

	}

}
