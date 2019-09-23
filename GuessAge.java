/**
*@program:GuessAge
*@Description:It's a procedure to determine the identity of this woman.
*@author:zhuojiaqian
*@date:2019.9.23
*/

import java.util.Scanner;
public class GuessAge{
	public static void main(String[] args){
		
		System.out.print("Please enter your age:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int check = age/18;
		switch(check){
			case 0:
			System.out.print("Beautifui girl!You are cute girl");
			break;
			case 1:
			System.out.print("Beautifui girl!You are big girl");
			break;
			default:
			System.out.print("Beautifui woman!You are aunt");
			break;
		}
		
		
  }
		
}