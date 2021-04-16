package com.collection;

import java.util.*;

import com.pojo.Student;

public class EvanSorting
	{

		public static void main(String[] args)
			{
				
				 ArrayList<Student> arraylist = new ArrayList<Student>();
				   arraylist.add(new Student(101, "Zues", 26));
				   arraylist.add(new Student(505, "Abey", 24));
				   arraylist.add(new Student(809, "Vignesh", 32));

				   /*Sorting based on Student Name*/
				   System.out.println("Student Name Sorting:");
				   Collections.sort(arraylist, Student.StuNameComparator);

				   for(Student str: arraylist){
						System.out.println(str);
				   }

				   /* Sorting on Rollno property*/
				   System.out.println("RollNum Sorting:");
				   Collections.sort(arraylist, Student.agecomparator);
				   for(Student str: arraylist){
						System.out.println(str);
				   }
				}
				
				
			}
	

	
	
