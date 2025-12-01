package intro;

import java.util.Scanner;

public class CalculPuissance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration
			int a,b,c;
				
		// saisie valeur
			Scanner scan =new Scanner (System.in);
			System.out.println("Veuillez saisir la valeur de a : ");
			a= scan.nextInt();
			System.out.println("Veuillez saisir la valeur de b : ");
			b= scan.nextInt();
			scan.close();
				
		//action
			c=1;
			for (int i=0;i<b;i++)
			{ 
			c=a*c;
			}
				
		//resultat
			System.out.println(a+" à la puissance " +b+ " égale à "+c);
	}

}
