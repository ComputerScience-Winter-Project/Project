import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		//������ ������ �� ����ġ������ ������ �����ǰԲ� �ϸ� �� ��
		//������ ��� �ø��°� �´°ɱ�??????????
		//switch������ �������� �Ҵ�Ǵ� ������ �������־����
		Warrior minhyuk = new Warrior();
		minhyuk.Health = 200;
		minhyuk.Level = 1;
		minhyuk.Job =1;
		Monster Slime = new Monster();
		Slime.Health = 300;
		Slime.Power = 10;
		System.out.println("��������"+"�������� �� �������� ü����"+Slime.Health);
		minhyuk.AttackH(Slime, 20);
		System.out.println(Slime.Health);
		
	}

}
