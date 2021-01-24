import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//직업을 선택할 때 스위치문으로 직업이 생성되게끔 하면 될 듯
		//메인을 길게 늘리는게 맞는걸까??????????
		//switch문으로 직업별로 할당되는 값들을 생성해주어야함
		int job;
		Scanner scan = new Scanner(System.in);
		System.out.print("직업 선택: ");
		job = scan.nextInt();
		switch(job) {
		case 0:
			Warrior wa = new Warrior();
			wa.Health = 200;
			wa.Mana = 150;
			wa.Level = 1;
			wa.Job = 0;
			break;
		case 1:
			Archer ar = new Archer();
			ar.Health = 150;
			ar.Mana = 100;
			ar.Level = 1;
			ar.Job = 1;
			break;
		case 2:
			Wizard wi = new Wizard();
			wi.Health = 100;
			wi.Mana = 250;
			wi.Level = 1;
			wi.Job = 2;
			break;
		}
	}
}
