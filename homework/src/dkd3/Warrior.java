package dkd3;

public class Warrior extends Character{
	 public Warrior(String name, int hp, int mp, int atk, int atk_speed) {
	     super(name, hp, mp, atk, atk_speed);
	 }
	 Warrior player1 = new Warrior("아처", 120, 30, 15, 5);
	
	 @Override
	 void useSkill(Monster m) {
	     System.out.println(name + "가 강력한 검술 스킬을 사용합니다!");
	 }
	     @Override
	     void attack(Character target) {
	         System.out.println(name + "가 " + target.name + "에게 " + atk + " 데미지로 공격합니다.");
	         target.damage(atk);
	     }

}