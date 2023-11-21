package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> candidati = new HashMap<>();
		
		String scelta, risposta;
		
		candidati.put("Mario Rossi", 0);
		candidati.put("Franco Verdi", 0);
		candidati.put("Pino Gialli", 0);
		candidati.put("Gino Marroni", 0);

	
	
		for(String v: candidati.keySet())
		{
			System.out.println("- "+v);
		}
		
		
		
		do
		{
			System.out.println("A quale candidato vuoi aggiungere un voto?");
			scelta = sc.nextLine();
			
			
			if(candidati.containsKey(scelta))
				candidati.put(scelta, candidati.get(scelta)+1);
			else
				System.out.println("Candidato non presente nella lista.");
			
			
			System.out.println("Vuoi inserire un altro voto? (si/no)");
			risposta = sc.nextLine();
			risposta = risposta.toLowerCase();
		}
		while(risposta.equals("si"));
		
		System.out.println("\n\nRisultato votazioni:");
		for(String v : candidati.keySet())
		{
			System.out.println(v+" - "+candidati.get(v));
		}
		
	}
}
