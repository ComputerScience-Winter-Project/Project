
public class Wizard extends Human{
	//�̹����� ������
	
	int Power = 0;
	public void IceBall(int Strength) {
		 Power = Strength * 300;
		Attack(Power);
		
	}
	
	public void Meteor(int Strength) {
		Power = Strength * 500;
		
		Attack(Power);
		
	}

}
