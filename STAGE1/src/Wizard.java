
public class Wizard extends Human{

	
	int Power = 0;
	public void IceBall(Monster Name,int Strength) {
		 Power = Strength * 300;
		AttackH(Name,Power);
		
	}
	
	public void Meteor(Monster Name , int Strength) {
		Power = Strength * 500;
		
		AttackH(Name,Power);
		
	}

}