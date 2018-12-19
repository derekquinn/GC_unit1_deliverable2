
package gC_unit1_deliverable2;

import java.util.Scanner;
import java.lang.Math;

public class d2 {

	public static void main(String[] args) {

		String string1;
		String string2;
		int string2total = 0;
		int string1total = 0;
		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first word:");
		string1 = sc.next();

		System.out.println("Please enter your second word:");
		string2 = sc.next();

		for (int i = 0; i < string1.length(); i++) {
			System.out.println(string1.charAt(i) + " : " + (int) string1.charAt(i));

			string1total = string1.charAt(i) + string1total;
		}

		for (int a = 0; a < string2.length(); a++) {

			System.out.println(string2.charAt(a) + " : " + (int) string2.charAt(a));

			string2total = string2.charAt(a) + string2total;

		}

		result = Math.abs(string1total - string2total);
		System.out.println("Difference (as an asolute value): " + result);

	}

}
