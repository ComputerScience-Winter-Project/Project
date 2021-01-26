
public class Monster {
	
	//체력이랑 공격--공격은 그냥 기본공격만
	//몬스터마다 체력이랑 기본 공격력이 다름
	int Health;
	int Power;
	public void AttackM(Human name,int damage) {
		name.Health -= damage;
		
		//만들어준 용사의 인스턴스의 Health에 접근하여 감소시켜주면 됨
	}
	public void BasicAttack(Human name,int Power)
	{
		AttackM(name,Power);
		
	}
	//몬스터 스킬은 좀 더 나중에 구현
	//몬스터수정
}
//몬스터가 공격을 하는 거 만들때 받는 인스턴스를 human으로 받아도 되나? human에 체력이 명시되어 있는거니끼
//될듯
