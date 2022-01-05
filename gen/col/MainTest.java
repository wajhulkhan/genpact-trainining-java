package com.org.gen.col;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the number of Employees..");
			int x = Integer.parseInt(br.readLine());
			
			Employee[] elist = new Employee[x];
			
			for(int i=1; i<=x; i++) {
				System.out.println("Enter the details for Employee "+i);
				int id = br.read();
				String name = br.readLine();
				String department = br.readLine();
				
				String dateOfJoining = br.readLine();
				int age = br.read();
				int salary = br.read();
				elist[i] = new Employee(id, name, department,dateOfJoining, age,salary);
			}
			
			EmployeeBO emb = new EmployeeBO();
			emb.printEmployees(elist);
			
			
		}catch(Exception e){}

	}

}
