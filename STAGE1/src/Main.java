import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//직업을 선택할 때 스위치문으로 직업이 생성되게끔 하면 될 듯
		//메인을 길게 늘리는게 맞는걸까??????????
		//switch문으로 직업별로 할당되는 값들을 생성해주어야함
		//이 앞에 이제 스토리 진행을 하는 부분들을 만들어줌 --이걸 다른 하나의 클래스로 만들어서 좀 더 main의 길이를 줄일까??
		Human hero = new Human();
		int job;
		Scanner scan = new Scanner(System.in);
		System.out.print("직업을 선택해 주세요: ");
		job = scan.nextInt();
		switch(job) {
		case 0:
			hero = new Warrior();
			hero.Health = 200;
			hero.Mana = 150;
			hero.Level = 1;
			hero.Job = 0;
			break;
		case 1:
			hero = new Archer();
			hero.Health = 150;
			hero.Mana = 100;
			hero.Level = 1;
			hero.Job = 1;
			break;
		case 2:
			hero = new Wizard();
			hero.Health = 100;
			hero.Mana = 250;
			hero.Level = 1;
			hero.Job = 2;
			break;
		}
		
	}
}

