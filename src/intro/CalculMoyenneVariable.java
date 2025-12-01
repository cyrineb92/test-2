package intro;

import java.util.Scanner;

public class CalculMoyenneVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
		
				double n1,n2,n3,n4,n5,moy;
				
				// saisie valeur
				
				//appel fontion Scanner
				
				Scanner clavier =new Scanner(System.in);
				System.out.println("Veuillez saisir la valeur de n1 : ");
				n1= clavier.nextDouble();
				System.out.println("Veuillez saisir la valeur de n2 : ");
				n2= clavier.nextDouble();
				System.out.println("Veuillez saisir la valeur de n3 : ");
				n3= clavier.nextDouble();
				System.out.println("Veuillez saisir la valeur de n4 : ");
				n4= clavier.nextDouble();
				System.out.println("Veuillez saisir la valeur de n5 : ");
				n5= clavier.nextDouble();
				clavier.close();
				
				//action
				
				moy=(n1+n2+n3+n4+n5)/5;
				
				//resultat
				System.out.println("La moyenne des valeurs "+n1+", "+n2+", "+n3+", "+n4 +" et "+n5+ " est égale à "+moy);

	}

}
