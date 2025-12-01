package intro;

import java.util.Scanner;

public class CalculSommeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
		double a,b,c,d;
		
		// saisie valeur
		//appel fontion Scanner
		Scanner clavier =new Scanner (System.in);
		System.out.println("Veuillez saisir la valeur de a : ");
		a= clavier.nextDouble();
		System.out.println("Veuillez saisir la valeur de b : ");
		b= clavier.nextDouble();
		System.out.println("Veuillez saisir la valeur de c : ");
		c= clavier.nextDouble();
		clavier.close();
		
		//action
		d=a+b+c;
		
		//resultat
		System.out.println("La somme des valeurs "+a+", "+b+" et "+c+ "est égale à "+d);
	}

}
