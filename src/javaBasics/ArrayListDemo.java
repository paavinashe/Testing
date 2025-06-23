package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	    //Declaration
		
	    ArrayList <Object> mylist = new ArrayList<Object>();
	  
		//List mylist = new ArrayList();
		
		//ArrayList <String> mylist = new ArrayList<String>();
	    mylist.add("welcome");
	    mylist.add('D');
	    mylist.add(true);
	    mylist.add(100);
	    mylist.add(10.5);
	    mylist.add(null);
	    
	    /*Iterator it = mylist.iterator();
	    while(it.hasNext())
	    {
	    System.out.println(it.next());
	    }*/
	    System.out.println(mylist);
	    
	    //Size of a arrylist
	    System.out.println("Size of arraylist:" +mylist.size());
		
		//remove elemnt fro arraylist
	    mylist.remove(4);
	    
	    System.out.println("After removing:" +mylist);
	    
	    //Insert element in the list
	    mylist.add(1,"java" );
	    System.out.println("After insering value:" +mylist );
	  
	    mylist.set(1, "python");
	    System.out.println("After replacing:" +mylist);
	    
	    //Aaccess specific element from list
	    System.out.println(mylist.get(4));
	    //System.out.println("After acessing:" +mylist);
	    
	    //Reading all the value from the arraylist
	    /*for(int i = 0; i< mylist.size();i++)
	    {
	    System.out.println(mylist.get(i));
	    }*/
	    
	    //Using for each loop
	    /*for(Object x:mylist )
	    {
	    	System.out.println(x);
	    }*/
	    
	    //By using Iterator
	    Iterator it = mylist.iterator();
	    while(it.hasNext()) 
	    {
	    	System.out.println(it.next());
	    }
	    
	    //Checking arraylist is empty or not
	    System.out.println("Is teh arraylist empty?" +mylist.isEmpty());
	    
	    //Remove all elements from arraylist
	    ArrayList list = new ArrayList();
	    
	    list.add("welcome");
	    list.add('D');
	    
	    
	    System.out.println(list);
	    
	    mylist.removeAll(list);
	    
	    System.out.println("After removing multiple elements:" +mylist);
	    
	    //Remove all the elements from the list/clear
	    mylist.clear();
	    System.out.println("Is arraylist empty? "+mylist.isEmpty());
	    
	    
	}

}
