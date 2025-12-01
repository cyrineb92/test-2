package intro;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
					int a,b;
						
				// saisie valeur
					Scanner scan =new Scanner (System.in);
					System.out.println("Veuillez saisir la valeur de a : ");
					a= scan.nextInt();

					scan.close();
						
				//action et Résultat
					if(a>0) 
					{
					b=1;
					for (int i=1;i<=a;i++)
					{ 
					b=b*i;

					}
					System.out.println("Factoriel de "+a+ " est égal à : "+b);
					}
					
					else
					{System.out.println("Erreur: impossible de faire le calcul");}
						
				}

}
