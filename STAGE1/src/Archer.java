
public class Archer extends Human {
	int Power;
	public void fireArrow(Monster Name,int Strength){
		Power = Strength * 250;
		AttackH(Name,Power);
	}
	public void arrowRain(Monster Name, int Strength){
		Power = Strength * 300;
		AttackH(Name,Power);
	}
}
