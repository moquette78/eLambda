package metier;

import interfaces.Ijeu;

public class Benji extends Personne{
	
	public Benji(String nom) {
		super(nom);
	}
	
	public void jouer(Ijeu ijeu) {
		ijeu.jouer();
	}

}