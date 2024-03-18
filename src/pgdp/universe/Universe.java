package pgdp.universe;

import java.util.HashSet;
import java.util.Set;

public class Universe {
	//we need to implement a method getUniverse(), thus we need a variable Universe universe that is private
	//shold be private cuz es darf in anderen Klassesn nicht möglich sein anderweitig ein Objekt dieser Klasses zu erstellen
	private static Universe universe;
	private Set<Animal> inhibitors;
	private Universe(){
		//die Inhibitors dieses Universums muss in einem HashSet gespeichert werden.
		inhibitors = new HashSet<>();
	}

	public void addInhibitor(Animal animal) {
		inhibitors.add(animal);
	}

	public static Universe getUniverse(){
		// soll einmalig ein neues Objekt erstellen und dann bei jedem Aufruf die Refereny auf dieses Objekt zrückgeben
		//
		if (universe == null){
			universe = new Universe();
		}
		return universe;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		inhibitors.forEach(animal -> sb.append(animal).append(","));
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
}
