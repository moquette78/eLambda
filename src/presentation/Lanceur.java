package presentation;

import metier.Benji;
import metier.Cedric;
import metier.Fati;
import service.ServiceSport;
import interfaces.Ijeu;

public class Lanceur {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Benji benji = new Benji("Benji");
		ServiceSport sSport = new ServiceSport();
		String msg ="Je joue";
		
		benji.jouer(new Ijeu() {
			
			@Override
			public void jouer() {
				System.out.println("Je joue ici");
			}
			
		});
		
		benji.jouer( () -> System.out.println("Je joue la"));
		//sSport.participerTriat(ced);
	}
	
}
