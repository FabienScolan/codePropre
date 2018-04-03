package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Animal animal1 = new Animal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		zoo.addAnimal(animal1);
		Animal animal2 = new Animal("Zèbre", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		zoo.addAnimal(animal2);
		Animal animal3 = new Animal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		zoo.addAnimal(animal3);
		Animal animal4 = new Animal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE);
		zoo.addAnimal(animal4);
		Animal animal5 = new Animal("Requin blanc", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE);
		zoo.addAnimal(animal5);
		Animal animal6 = new Animal("Truite dorée", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE);
		zoo.addAnimal(animal6);
		Animal animal7 = new Animal("Boa constrictor", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE);
		zoo.addAnimal(animal7);
		Animal animal8 = new Animal("Python", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE);
		zoo.addAnimal(animal8);
	}

}
