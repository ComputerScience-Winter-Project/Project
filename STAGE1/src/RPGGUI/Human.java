package RPGGUI;

public class Human {
	//�����Դϴ�.
	//����̸��� ������
	//ü�� ,���� ,����
	int Health; //�������� �ٸ��� ����--ex)����� ü���� ������ ���� ���� ,����� ü���� ������ ���̰���, �ü��� �� �� �ݹ�
	int Mana;
	int Level=0; //�ϴ��� ���� �� ������ 1�� ������ ���� ��!
	int Job;//0�� ����, 1�� �ü�, 2�� ����
	int Growth_Health;
	int Growth_Mana;
	
	public Human(int Health, int Mana, int Level, int Job, int Growth_Health, int Growth_Mana) {
		this.Health = Health;
		this.Mana = Mana;
		this.Level = Level;
		this.Job = Job;
		this.Growth_Health = Growth_Health;
		this.Growth_Mana = Growth_Mana;
	}

	public void AttackH(Monster monster,int Damage) {
		monster.Health -= Damage;
		if(monster.Health > 0) {
			Making.btn_attack.setEnabled(false);
			Making.btn_skill1.setEnabled(false);
			Making.btn_skill2.setEnabled(false);
			Making.lb_statement.setText("������ ü����" + monster.Health + "���ҽ��ϴ�.");
			Making.hp_bar_monster.setValue(monster.Health);
			Making.mp_bar.setValue(Mana);
		}
		else {
			Making.btn_attack.setEnabled(false);
			Making.btn_skill1.setEnabled(false);
			Making.btn_skill2.setEnabled(false);
			Making.btn_turnchange.setVisible(false);
			Making.btn_exit.setVisible(true);
			Making.hp_bar_monster.setValue(0);
			Making.lb_statement.setText("���Ͱ� ���������ϴ�.");
		}
		//�̸��� �޾Ƽ� �� �ȿ� �ִ� �ν��ͽ��� ü���� ��µ� ���� ��������ŭ
		//�Է¹��� ��������ŭ ������ ü���� ����
		//������ ü���� ��ƾ��ϱ� ������ ���� �߿���
		//����� �Է¹ް� ����� ü���� ���������� �����ؼ� �� ü���� ��� ���� static ���
	}
	public void BasicAttack(Monster monster,int Job) {
		//�������� ����������ؼ� punch�� ���Խ�Ŵ
		int Punch = 0;
		switch(Job) {
		case  0 : //������ ���
			Punch = 400 + Level *100;
			Making.lb_statement.setText("����� �⺻ ������ �Ͽ���");
			break;
		case 1 : //�ü��� ���
			Punch = 400 + Level *150;
			Making.lb_statement.setText("����� �⺻ ������ �Ͽ���");
			break;
		case 2 :
			Punch = 200 + Level *100;
			Making.lb_statement.setText("����� �⺻ ������ �Ͽ���");
			break;
		}
		AttackH(monster,Punch);
	}
	
}

class Warrior extends Human{
	public Warrior(int Health, int Mana, int Level, int Job, int Growth_Health, int Growth_Mana) {
		super(Health, Mana, Level, Job, Growth_Health, Growth_Mana);
	}
	public  void SwordDancing(Monster monster,int Level) {
		int Power = Level* 800;
		Mana = Mana-40;
	    AttackH(monster,Power);
	}
		
	public void  Chopping(Monster monster, int Level){
		int Power = Level*600;
		Mana = Mana-25;
		AttackH(monster, Power);
	}
}