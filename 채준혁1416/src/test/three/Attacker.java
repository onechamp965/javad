package test.three;

public class Attacker extends AbstractMonster{

    public Attacker(String name, int hp, int attack, int defense) {
		super("Attacker", 30, 20, 10);
	}	
	public int attack() {
		System.out.println("Attacker - Very Strong Attack ");
		return attack;
	}
}
