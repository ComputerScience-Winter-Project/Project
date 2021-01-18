
public class Human {
	//수정입니다.
	//용사이름은 정해줌
	//체력 ,마나 ,레벨
	int Heath; //직업별로 다르게 제공--ex)전사는 체력은 높지만 딜이 약함 ,법사는 체력이 낮지만 딜이강함, 궁수는 둘 다 반반
	int Mana; //직업별로 마나도 다르게 제공
	int Level=0;
	int Job;//0은 전사, 1은 궁수, 2는 법사

	public void Attack(int Damage) {
		//입력받은 데미지만큼 상대방의 체력을 깎음
		//몬스터의 체력을 깎아야하기 때문에 가장 중요함
		
	}
	public void BasicAttack(int Job) {
		//직업별로 데미지계산해서 punch에 대입시킴
		int Punch = 0;
		Attack(Punch);
		}
	
}