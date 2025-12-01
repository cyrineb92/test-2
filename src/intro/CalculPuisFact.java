package intro;

import java.util.Scanner;

public class CalculPuisFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			// declaration
					int a, b;
					
					//appel fontion Scanner
					Scanner clavier =new Scanner (System.in);
					System.out.println("Veuillez saisir la valeur de a : ");
					a= clavier.nextInt();
					System.out.println("Veuillez saisir la valeur de b : ");
					b= clavier.nextInt();
					
					if (a<=5) {
					Puissance (a,b);	
					}
					else {
					Factorielle (a);	
					}
		}
	
		public static int Puissance(int x, int y) {	
			int k=0;
			for (int i=0;i<y;i++)
			{ 
			k=x*x;
			}
			System.out.println("La puissance de "+x+" et "+y+ " est égale à "+k);
			return k;
	        }

		public static int Factorielle(int x) {	
			int k=1;
			for (int i=1;i<=x;i++)
		    	{ 
				k=k*i;
			    }
			System.out.println("Le Factorielle de "+x+" est égale à "+k);
			return k;
	        }
		
	}
