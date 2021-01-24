
public class Human {
	//수정입니다.
	//용사이름은 정해줌
	//체력 ,마나 ,레벨
	int Health; //직업별로 다르게 제공--ex)전사는 체력은 높지만 딜이 약함 ,법사는 체력이 낮지만 딜이강함, 궁수는 둘 다 반반
	int Mana;
	int Level=0; //일단은 몬스터 한 마리당 1씩 증가로 생각 중!
	int Job;//0은 전사, 1은 궁수, 2는 법사

	public void AttackH(Monster Name,int Damage) {
		Name.Health -= Damage;
		//이름을 받아서 그 안에 있는 인스터스의 체력을 깎는데 옆에 데미지만큼
		//입력받은 데미지만큼 상대방의 체력을 깎음
		//몬스터의 체력을 깎아야하기 때문에 가장 중요함
		//대상을 입력받고 대상의 체력을 전역변수로 설정해서 그 체력이 닳게 구현 static 사용
	}
	public void BasicAttack(Monster Name,int Job) {
		//직업별로 데미지계산해서 punch에 대입시킴
		int Punch = 0;
		switch(Job) {
		case  1 : //전사의 경우
			Punch = 400 + Level *100;
		case 2 : //궁수의 경우
			Punch = 600 + Level *150;
		case 3 :
			Punch = 200 + Level *100;
		}
		AttackH(Name,Punch);
		}
	
}