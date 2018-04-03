package ex3;

public enum ComportementAnimal {
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivore");
	
	private String comp;
	private ComportementAnimal(String type){
		this.comp=type;
	}
	public String getComportement() {
		return comp;
	}
	public void setComportement(String type) {
		this.comp = type;
	}

}
