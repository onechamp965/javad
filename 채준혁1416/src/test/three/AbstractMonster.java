package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	protected String getName() {
		return name;
	}
	protected int getHp() {
		return hp;
	}
	protected int getAttack() {
		return attack;
	}
	protected int getDefense() {
		return defense;
	}
	
	protected AbstractMonster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public void defense (int defense ) {
		if( this.defense < attack ) {
			if ( this.defense - attack > 0) hp -= (this.defense - attack);
			if ( this.defense - attack < 0) hp += (this.defense - attack);
		}
	}
	public int attack() {
		System.out.println(attack);
		return attack;
	}
}
