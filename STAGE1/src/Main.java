import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Human hero = new Human();
		int job;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
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
		
		Monster monster = new Monster();
		monster.AttackM(hero, 50);
		System.out.println("����� ���� ü��: " + hero.Health);
		Moving mv = new Moving();
		mv.MyFrame();
	}
}

