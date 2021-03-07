package RPGGUI;

public class Monster {
	
	//체력이랑 공격--공격은 그냥 기본공격만
	//몬스터마다 체력이랑 기본 공격력이 다름
	int Health;
	int Power;
	
	public Monster(int Health, int Power) {
		this.Health = Health;
		this.Power = Power;
	}
	public void AttackM(Human hero,int damage) {
		hero.Health -= damage;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(hero.Health>0) {
			Making.btn_attack.setEnabled(true);
			Making.btn_skill1.setEnabled(true);
			Making.btn_skill2.setEnabled(true);
			Making.btn_turnchange.setVisible(false);
			Making.lb_statement.setText("당신의 체력이"+ hero.Health + "남았습니다.");
			Making.hp_bar_hero.setValue(hero.Health);
		}
		else {
			Making.btn_attack.setEnabled(false);
			Making.btn_skill1.setEnabled(false);
			Making.btn_skill2.setEnabled(false);
			Making.btn_turnchange.setVisible(false);
			Making.btn_exit.setVisible(true);
			Making.hp_bar_hero.setValue(0);
			Making.lb_statement.setText("당신이 쓰러졌습니다");
		}
		if(hero.Mana<40)
			Making.btn_skill1.setEnabled(false);
		if(hero.Mana<25)
			Making.btn_skill2.setEnabled(false);
		
		hero.Mana = hero.Mana + hero.Growth_Mana;
		Making.mp_bar.setValue(hero.Mana);
		
		//만들어준 용사의 인스턴스의 Health에 접근하여 감소시켜주면 됨
	}
	public void BasicAttack(Human hero,int Power)
	{
		AttackM(hero,Power);
		
	}
}
	
class Slime extends Monster {
	
	public Slime(int Health, int Power) {
		super(Health, Power);
	}
	
	public void skill1(Human hero, int Power) {
		int Damage = Power*2;
		System.out.print("슬라임이 스킬을 사용했다\n");
		AttackM(hero,Damage);
	}
	
}

