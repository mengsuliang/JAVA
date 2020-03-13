package com.example.manager_test;


public class ManagerTest {
	public static void main (String[] args){
//		Employee e = new Employee("halen", 80000, 2022, 6, 27);
		Manager[] managers = new Manager[10];
		Employee[] staff= managers;
		staff[0] = new Employee("halen", 80000, 2022, 6, 27);
//		managers[0].setBonus(1000);
		System.out.println("Ãû×Ö:"+staff[0].getName()+"Ð½×Ê:"+staff[0].getSalary());
	}

}

