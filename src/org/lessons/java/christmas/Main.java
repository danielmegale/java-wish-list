package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		List<Regalo> listaRegalo = new ArrayList<>();
		
		while(true) {
		System.out.println("Vuoi aggiungere un altro regalo? Digitari SI o NO");
		String input = in.nextLine();
		if(input.equalsIgnoreCase("si")) {
			
		System.out.println("Inserisci il nome del regalo");
		String nome = in.nextLine();
		System.out.println("Inderisci il destinatario del regalo");
		String destinatario = in.nextLine();
		
		Regalo regalo = new Regalo(nome , destinatario);
		
		listaRegalo.add(regalo);
		
		System.out.println("Scegli in quale ordine stampare la lista(nome o destinatario)");
		String order=in.nextLine().toLowerCase();
		
		if(order.equals("nome")) {
			Collections.sort(listaRegalo, Comparator.comparing(Regalo::getNome));
		}else if(order.equals("destinatario")) {
			Collections.sort(listaRegalo, Comparator.comparing(Regalo::getDestinatario));
			
		}else {
			System.out.println("Modalità di ordinamento non valida. La lista verrà mostrata senza ordinamento.");
		}
		
		System.out.println("\nLista dei regali:");
		
        for (Regalo gift : listaRegalo) {
            System.out.println("Nome: " + gift.getNome() + ", Destinatario: " + gift.getDestinatario());
        }
		}else
			break;

	}
		in.close();
	}
}
