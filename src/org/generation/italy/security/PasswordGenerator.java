package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		//Dichiarazione e inizializzazione variabili
		
		String name = "gianmarco";
		String surname = "bosetti";
		String favColour = "blue";
		int dBirth = 19;
		int mBirth = 1;
		int yBirth = 1995;
		int sum = dBirth + mBirth + yBirth;
		
		//Creazione password con concatenazione variabili
		
		String password = name + "-" + surname + "-" + favColour + "-" + sum;
		
		System.out.println("La password generata è: " + password);

	}

}
