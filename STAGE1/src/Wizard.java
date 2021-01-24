
public class Wizard extends Human{

	
	int Power = 0;
	public void IceBall(Monster Name,int Level) {
		 Power = Level * 300;
		AttackH(Name,Power);
		
	}
	
	public void Meteor(Monster Name , int Level) {
		Power = Level * 500;
		
		AttackH(Name,Power);
		
	}

}