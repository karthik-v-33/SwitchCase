package com.GitHub_Updates;
import java.util.Scanner;
public class SwitchCaseVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter and find vowel or not :");
		char a = sc.next().charAt(0);
		switch(a) {
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println("It is Vowel");
		break;
		default:
			System.out.println("Its not an Vowel");
		}
	}

}
