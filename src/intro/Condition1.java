package intro;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		
		// Déclaration
		int a;
		//saisie valeurs
		Scanner scan =new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre a : ");
		a= scan.nextInt();
		scan.close();
		//action
		
		//resultat
		if(a>0) 
		{System.out.println("Le nombre saisie est positif");}
		else if(a<0) 
		{System.out.println("Le nombre saisie est negatif");}
		else
		{System.out.println("Le nombre saisie est neutre");}

	}

}
