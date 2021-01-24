import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		//직업을 선택할 때 스위치문으로 직업이 생성되게끔 하면 될 듯
		//메인을 길게 늘리는게 맞는걸까??????????
		//switch문으로 직업별로 할당되는 값들을 생성해주어야함
		Warrior minhyuk = new Warrior();
		minhyuk.Health = 200;
		minhyuk.Level = 1;
		minhyuk.Job =1;
		Monster Slime = new Monster();
		Slime.Health = 300;
		Slime.Power = 10;
		System.out.println("전투시작"+"전투시작 전 슬라임의 체력은"+Slime.Health);
		minhyuk.AttackH(Slime, 20);
		System.out.println(Slime.Health);
		
	}

}
