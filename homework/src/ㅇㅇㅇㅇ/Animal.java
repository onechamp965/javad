package ㅇㅇㅇㅇ;

public class Animal {
	private Animal Animal;
	
	public Animal(Animal Animal) {
		this.Animal = Animal;
	}
	
	public void sound(String name) {
		System.out.println("동물 이름: " + name);
		Animal.sound(name);
		System.out.println("울었음");
	}
}
