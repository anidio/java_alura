package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Formulários com HTML", 30 );
		Aula a2 = new Aula("Aplicando css no formulário", 21 );
		Aula a3 = new Aula("Deixando formulário dinâmico com javascript", 17 );
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula:: getTempo));
		
		System.out.println(aulas);
		
	}

}
