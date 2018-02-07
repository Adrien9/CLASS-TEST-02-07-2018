package Phones3;

import java.util.Scanner;

public class Phones3Test {

	
	public static void main(String[]args){
		
	Scanner scanner=new Scanner(System.in);	


	int iPhoneX=1, iPhone8=2, Samsung8=3;
	
	
		Phones3 phone=new Phones3("iPhone", "X", 2017, 999.99);
		
		System.out.println("Phone 1");
		System.out.print(phone.name);
		System.out.print(" " +phone.brand);
		System.out.println(", " + phone.year);
		
Phones3 phone2=new Phones3("iPhone", "8", 2017, 499.99);
		
		System.out.println("Phone 2");
		System.out.print(phone2.name);
		System.out.print(" " +phone2.brand);
		System.out.println(", " + phone2.year);
		
Phones3 phone3=new Phones3("Samsung", "Galaxy 8", 2017, 459.99);
		
		System.out.println("Phone 3");	
		System.out.print(phone3.name);
		System.out.print(" " +phone3.brand);
		System.out.println(", " + phone3.year);
		
		
		System.out.println("Which phone do you want?  You can choose either 1, 2 or 3.");
		int choice=scanner.nextInt();

		if(choice==iPhoneX)
		{
			System.out.println("The phone's price is $" + phone.price);
		
		}
			
		if(choice==iPhone8)
		{
				
				System.out.println("The phone's price is $" + phone2.price);
		}
		
		if(choice==Samsung8)
		{
					System.out.println("The phone's price is $" + phone3.price);
				}
			}
		}
	
