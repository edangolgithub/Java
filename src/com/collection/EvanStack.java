package com.collection;

import java.util.Iterator;
import java.util.Stack;

public class EvanStack
	{
		public static void main(String args[]){  
			Stack<String> stack = new Stack<String>();  
			stack.push("Ayush");  
			stack.push("Garvit");  
			stack.push("Amit");  
			stack.push("Ashish");  
			stack.push("Garima");  
			stack.pop();  
			stack.pop(); 
			
			System.out.println(stack.peek());
			
			
	}
	}
