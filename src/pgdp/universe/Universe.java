package pgdp.universe;

import java.util.HashSet;
import java.util.Set;

public class Universe {

	private Set<Animal> inhibitors;

	public void addInhibitor(Animal animal) {
		inhibitors.add(animal);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		inhibitors.forEach(animal -> sb.append(animal).append(","));
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
}
