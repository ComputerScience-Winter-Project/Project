package RPGGUI;

public class Monster {
	
	//ü���̶� ����--������ �׳� �⺻���ݸ�
	//���͸��� ü���̶� �⺻ ���ݷ��� �ٸ�
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
			Making.lb_statement.setText("����� ü����"+ hero.Health + "���ҽ��ϴ�.");
			Making.hp_bar_hero.setValue(hero.Health);
		}
		else {
			Making.btn_attack.setEnabled(false);
			Making.btn_skill1.setEnabled(false);
			Making.btn_skill2.setEnabled(false);
			Making.btn_turnchange.setVisible(false);
			Making.btn_exit.setVisible(true);
			Making.hp_bar_hero.setValue(0);
			Making.lb_statement.setText("����� ���������ϴ�");
		}
		if(hero.Mana<40)
			Making.btn_skill1.setEnabled(false);
		if(hero.Mana<25)
			Making.btn_skill2.setEnabled(false);
		
		hero.Mana = hero.Mana + hero.Growth_Mana;
		Making.mp_bar.setValue(hero.Mana);
		
		//������� ����� �ν��Ͻ��� Health�� �����Ͽ� ���ҽ����ָ� ��
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
		System.out.print("�������� ��ų�� ����ߴ�\n");
		AttackM(hero,Damage);
	}
	
}

