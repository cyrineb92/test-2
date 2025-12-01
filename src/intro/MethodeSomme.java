package intro;

import java.util.Scanner;

public class MethodeSomme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// declaration
				double a,b,r;
				
				// saisie valeur
				//appel fontion Scanner
				Scanner clavier =new Scanner (System.in);
				System.out.println("Veuillez saisir la valeur de a : ");
				a= clavier.nextDouble();
				System.out.println("Veuillez saisir la valeur de b : ");
				b= clavier.nextDouble();
				
				Somme(a,b);
				r=SommeRetour(a,b)*2;
	}
	
	public static void Somme(double x, double y) {	
		double k;
		k=x+y;
		System.out.println("La somme des valeurs "+x+" et "+y+ " est égale à "+k);
	}
	
	public static double SommeRetour(double x, double y) {	
		double k;
		k=x+y;
		System.out.println("La somme des valeurs "+x+" et "+y+ " est égale à "+k);
		return k;
	}

}
