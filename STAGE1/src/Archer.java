
public class Archer extends Human {
	int Power;
	public void fireArrow(Monster Name,int Level){
		Power = Level * 600;
		AttackH(Name,Power);
	}
	public void arrowRain(Monster Name, int Level){
		Power = Level * 700;
		AttackH(Name,Power);
	}
}
