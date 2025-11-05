package dkd3;

abstract class Character {
	abstract void useSkill(Monster m);
	String name;
	int hp, atk, atk_speed, mp;

	public Character(String name, int hp, int mp, int atk, int atk_speed) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.atk_speed = atk_speed = 1;
	}
	
	abstract void attack(Character target);
	
	boolean die_or_alice() {
		return hp > 0;
	}
	void damage(int dmg) {
		int realDamage = Math.max(0, dmg);
		hp -= realDamage;
		System.out.println(name + "님 맞음 ㅇㅇ" + dmg + "정도?");
	}
}
