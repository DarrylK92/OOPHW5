/*
	This program creates two different Services and Supplies classes and prints out their toStrings and
		runs each of their unique CalculateSales methods.
		
	Author: Darryl Karney
	Course: CPSC24500
 */

package hw5;

import java.util.ArrayList;

public class companySales {

	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<>();
		
		accountList.add(new Services(8, 10.25, 1));
		accountList.add(new Supplies(4, 5.5, 2));
		accountList.add(new Services(32, 15.75, 3));
		accountList.add(new Supplies(25, 7.82, 4));
		
		for(Account e : accountList) {
			System.out.println(e);
			e.CalculateSales();
		}
	}

}
