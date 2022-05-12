package com.chainsys.unittest;

import com.chainsys.diffrentclass.Branch;
import com.chainsys.diffrentclass.CustomerAccountDetail;
import com.chainsys.diffrentclass.Person;

public class DifferentClassTest {
	public static void testCustomer() {

		Branch branch = new Branch(55);
		branch.setLocation("Rajapalayam");
		branch.setManagerId(3114);
		System.out.println("Bank_Name: "+Branch.getBankName());
		System.out.println("Branch_Id: "+branch.getId());
		System.out.println("Branch_Manager_Id: "+branch.getManagerId());
		CustomerAccountDetail customer = new CustomerAccountDetail(15, 1010006578);
		customer.setAccount_type("Savings");
		customer.setCurrent_balance(10000);
		System.out.println("Customer_Id: "+customer.getCustomer_id());
		System.out.println("Account_Number: "+customer.getAccount_number());
		System.out.println("Account_type: "+customer.getAccount_type());
		System.out.println("Balance_Amount: "+customer.getCurrent_balance());
		Person employee = new Person(3114);
		employee.setName("Ayyanar A");
		employee.setAddress("34/Madasamy Nadar Street,Muhavur,virudunagar (Dist) -626111");
		employee.setPhone_number(8610135556L);
		employee.setE_mail_address("ayyanar.arumugasamy@chainsys.com");
		System.out.println("Employee_Name: "+employee.getName());
		System.out.println("Employee_Address: "+employee.getAddress());
		System.out.println("Employee_Ph_No: "+employee.getPhone_number());
		System.out.println("Employee_Mail: "+employee.getE_mail_address());
		
	}
}
