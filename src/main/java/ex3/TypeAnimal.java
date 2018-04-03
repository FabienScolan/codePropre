package ex3;

public enum TypeAnimal {
	MAMMIFERE("Mammifere"),
	REPTILE("Reptile"),
	POISSON("Poisson");
	
	private String type;
	private TypeAnimal(String type){
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
