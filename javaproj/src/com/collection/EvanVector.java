package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class EvanVector
	{

		public static void main(String[] args)
			{
				Vector<String> v=new Vector<String>();  
				v.add("Ayush");  
				v.add("Amit");  
				v.add("Ashish");  
				v.add("Garima");  
				Iterator<String> itr=v.iterator();  
				while(itr.hasNext()){  
				System.out.println(itr.next()); 
			}

	}
	}
