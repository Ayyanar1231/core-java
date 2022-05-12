package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class TestEmployee {
	public static void testEmployee() {
	Employee firstEmployee = new Employee(1234);
	firstEmployee.setName("Ayyanar");
	System.out.println(firstEmployee.getName());
	}
	public static void testCity() {
		Employee firstCity = new Employee(1234);
		firstCity.setCity("Rajapalayam");
		System.out.println(firstCity.getCity());
		}
	public static void testSalary() {
		Employee firstSalary = new Employee(1234);
		firstSalary.setSalary(1000000);
		System.out.println(firstSalary.getsalary());
		}
}
