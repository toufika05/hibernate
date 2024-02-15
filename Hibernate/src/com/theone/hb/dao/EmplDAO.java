package com.theone.hb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.theone.hb.model.Empl;

public class EmplDAO {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//persistence objects
		Configuration cfg=new Configuration();
		cfg.configure();//it will help us to get the configuration to connect database(hibernatee.cgf.xml)
		
		SessionFactory factory = cfg.buildSessionFactory();//it helps us to virtually connect the database
                                                           //it also helps us to create multiple session object
		
		           Session session = factory.openSession();///it helps us to create session object
		           ///session helps us to perform CURD operation 
		           
		     Transaction transaction = session.beginTransaction();// it helps us to begin the transaction for commit and rollback operation
		     
		     
		     /////==========create==============      
//		           Empl empl=new  Empl()
//		           empl.setId(101);  
//		           empl.setName("Toufika");
//		           session.save(empl);
		     
		          
		     
		           
		     ////////========read============
		      // Empl empl = session.load(Empl.class, 101);
		     //System.out.println(empl.getId()+" "+empl.getName()); 
		    
		    //======update========
		      // Empl empl2 = session.load(Empl.class, 101);
		     //empl2.setName("Tina");
		    // session.update(empl2); 
		    
		    //=====delete============
		    // Empl empl3 = session.load(Empl.class, 101);
		   //session.remove(empl3);
		     
		     
		  //===with the help of query we can perform read, update and delete operation   
		   //=====Query without condition======//////////
		     // Query query = session.createQuery("from Empl");
		       //  List list = query.list();
		         //list.forEach(System.out::println);
		           
		   //=====Query with condition======//////////
			  // Query query = session.createQuery("from Empl where id=101");  
			  // Empl empl =(Empl) query.uniqueResult();
			  // System.out.println(empl);
		     
		     
	    //========only for read operation========	   
		 //==========criteria=======///////////
			 //  Criteria criteria = session.createCriteria(Empl.class); ///select* from empl
			  // criteria.add(Restrictions.eq("id", 101)); /// where condition
			   
			  // Empl empl =(Empl) criteria.uniqueResult();
			  // System.out.println(empl);
		     
		
		//===========criteria without  any condition===========
		     Criteria criteria = session.createCriteria(Empl.class); //select*  from empl*
		     List list = criteria.list();
		     list.forEach(System.out::println);     
		             
		       transaction.commit();//now data will be commited to the database
		           
		           session.close();
		           factory.close();
	}

}
