package intro;

import java.util.Scanner;

public class condition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Déclaration
		String type_article;
		Double prix_article, prix_solde;
		
		//saisie valeurs
		Scanner scan_art =new Scanner(System.in);
		System.out.println("Veuillez saisir l'article : ");
		type_article = scan_art.next();
		
		System.out.println("Veuillez saisir le prix de l'article : ");
		prix_article = scan_art.nextDouble();
		scan_art.close();
		
		//action et resultat
		if(type_article.equals("PULL")) 
		   {prix_solde = prix_article-(prix_article*0.2);
			System.out.println("Le nouveau prix du PULL apres solde de 20% est: "+prix_solde);}
		
		else if(type_article.equals("PONTALON"))
		{prix_solde = prix_article-(prix_article*0.4);
		System.out.println("Le nouveau prix du PONTALON apres solde de 40% est: "+prix_solde);}
		
		else if(type_article.equals("CHAUSSURES"))
		{prix_solde = prix_article-(prix_article*0.6);
		System.out.println("Le nouveau prix des CHAUSSURES apres solde de 60% est: "+prix_solde);}
		
		else 
		{System.out.println("pas de Solde pour le type "+ type_article);}
		
	}

}
