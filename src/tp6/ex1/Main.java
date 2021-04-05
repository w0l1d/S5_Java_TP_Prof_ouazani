package tp6.ex1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> noms = new ArrayList<>();
		noms.add("meknes");
		noms.add("rabat");
		noms.add("agadir");
		noms.add("tanger");
		noms.add("oujda");
		noms.add("fes");

		System.out.println("Avant le trie : ");
		for (String nom :
				noms)
			System.out.print(nom + " ");



		System.out.println("\n\nApres le trie : ");
		Collections.sort(noms);
		for (Iterator it = noms.iterator();it.hasNext();)
			System.out.print(it.next().toString() + " ");




		System.out.println("\n\nApres la modification : ");
		noms.set(1, "bostone");

		for (ListIterator l = noms.listIterator(); l.hasNext();)
			System.out.print(l.next().toString() + " ");




		System.out.println("\n\nApres la supression : ");
		noms.remove(1);

		for (ListIterator l = noms.listIterator(); l.hasNext();)
			System.out.print(l.next().toString() + " ");



	}

}
