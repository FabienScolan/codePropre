package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	

		protected List<Animal> animaux = new ArrayList<Animal>();
		
		public void addAnimal(Animal animal) {
			animaux.add(animal);
		}
		
		public void afficherListeAnimaux(){
			for (Animal a: animaux){
				System.out.println(a.getNom());
			}
		}
		
		public int compterAnimaux(){
			return animaux.size();
		}
		
		public abstract double calculerKgsNourritureParJour();
			
}
