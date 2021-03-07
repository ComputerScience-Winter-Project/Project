package RPGGUI;

public class Human {
	//수정입니다.
	//용사이름은 정해줌
	//체력 ,마나 ,레벨
	int Health; //직업별로 다르게 제공--ex)전사는 체력은 높지만 딜이 약함 ,법사는 체력이 낮지만 딜이강함, 궁수는 둘 다 반반
	int Mana;
	int Level=0; //일단은 몬스터 한 마리당 1씩 증가로 생각 중!
	int Job;//0은 전사, 1은 궁수, 2는 법사
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
			Making.lb_statement.setText("몬스터의 체력이" + monster.Health + "남았습니다.");
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
			Making.lb_statement.setText("몬스터가 쓰러졌습니다.");
		}
		//이름을 받아서 그 안에 있는 인스터스의 체력을 깎는데 옆에 데미지만큼
		//입력받은 데미지만큼 상대방의 체력을 깎음
		//몬스터의 체력을 깎아야하기 때문에 가장 중요함
		//대상을 입력받고 대상의 체력을 전역변수로 설정해서 그 체력이 닳게 구현 static 사용
	}
	public void BasicAttack(Monster monster,int Job) {
		//직업별로 데미지계산해서 punch에 대입시킴
		int Punch = 0;
		switch(Job) {
		case  0 : //전사의 경우
			Punch = 400 + Level *100;
			Making.lb_statement.setText("당신은 기본 공격을 하였다");
			break;
		case 1 : //궁수의 경우
			Punch = 400 + Level *150;
			Making.lb_statement.setText("당신은 기본 공격을 하였다");
			break;
		case 2 :
			Punch = 200 + Level *100;
			Making.lb_statement.setText("당신은 기본 공격을 하였다");
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