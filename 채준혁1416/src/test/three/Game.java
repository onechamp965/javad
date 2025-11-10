package test.three;

public class Game {

	public static void main(String[] args) {
		AbstractMonster m1 = new Attacker("Attacker", 30, 20, 10);
		AbstractMonster m2 = new Defender("Defender", 20, 13, 25);
		
		m1.defense(m2.attack());
		m2.defense(m1.attack());
		
		System.out.println(m1.name + ":" + m1.hp);
		System.out.println(m2.name + ":" + m2.hp);
	}

}
