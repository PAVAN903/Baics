package com.javabasics;

import java.util.Scanner;

public class String1 {
	static int year;

	public static void main(String[] args) {
	
		try (Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter the year");
			year =sc.nextInt();
		}
		if(year>=1582) {
			if(((year%4==0) && (year % 100 != 0)) || (year % 400 ==0))
					{
				System.out.println("the "+year+" the year are loop");
					}
			else
			{
				System.out.println("the "+year+" the year are not loop");	
			}
		}
			else
			{
				System.out.println("enter year greater than 1582");	
		}
		}

	
	
	}
