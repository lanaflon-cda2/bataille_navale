package modele;
public  class Destroyer {

	protected String nom;		//type du bateau
	protected int taille;		//taille du bateau

	
	//constructeur 
	public Destroyer(String n, int nbCases){
		nom = n;
		taille = nbCases;
		
	}
	
	//retourne le nom du bateau (type)
	public String getNom(){
		return nom;
	}
	
	//retourne la taille du bateau
	public int getTaille(){
		return taille;
	}
}
	