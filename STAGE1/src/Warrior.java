
public class Warrior extends Human {
	//전사직업을 택했을 경우
	//기본공격 메소드는 메인클래스
	//전사이기 떄문에 체력이 많음
	//부모클래스---체력이랑 마나랑 레벨 정도만 구현해줌--부모클래스를 만들어야함 
	
	public  void SwordDancing(Monster Name,int Strength) //Strength==레벨증가할때마다만 증가
	{
		int Power = Strength*200;
		
	     AttackH(Name,Power);
		//Attack 함수는 적을 공격하는 함수로 밑에는 gui로 공격씬을 넣을 예정
		//가렌 e같은 느낌

			
		}
		
	public void  Chopping(Monster Name, int Strength){//찍기공격
		int Power = Strength*120;
		
		AttackH(Name, Power);
		
	}
	
}
