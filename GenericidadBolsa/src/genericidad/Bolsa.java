package genericidad;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {

	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa() {
		this.tope = 0;
	}
	public Bolsa(int tope) {
		this.tope = tope;
	}

	public void add(T objeto) {
		if (lista.size() <= tope) {

			lista.add(objeto);
		} else {

			throw new RuntimeException("NO CABEN MAS EN LA BOLSA!!!");
			//System.out.println("NO CABEN MAS EN LA BOLSA !!!");
		}

	}

	public Iterator<T> iterator() {
		return lista.iterator();
	}

}
