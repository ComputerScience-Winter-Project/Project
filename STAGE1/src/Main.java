import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//������ ������ �� ����ġ������ ������ �����ǰԲ� �ϸ� �� ��
		//������ ��� �ø��°� �´°ɱ�??????????
		//switch������ �������� �Ҵ�Ǵ� ������ �������־����
		int job;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
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
