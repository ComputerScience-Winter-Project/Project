
public class Archer extends Human {
	int Power;
	public void fireArrow(int Strength){
		Power = Strength * 250;
		Attack(Power);
	}
	public void arrowRain(int Strength){
		Power = Strength * 300;
		Attack(Power);
	}
}