package dkd3;

public class Monster {
	String name;
	int hp;
	int atk;
	int atk_speed;
	
	Monster(String name, int hp, int atk, int atk_speed) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.atk_speed = atk_speed;
	}
	void attack(Character c) {
		System.out.println(name + "이(가) 공격!");
		c.damage(atk);
	}
	void takeDamage(int dmg) {
		hp -= dmg;
		System.out.println(name + "이(가)" + dmg + "피해를 입음!(HP: " + hp + ")");
	}
	boolean die_or_alive() {
		return hp > 0;
	}
	
}
