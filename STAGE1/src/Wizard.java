
public class Wizard extends Human{
	//이번에는 마법사
	
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
