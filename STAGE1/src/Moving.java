import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;//Ű�� �Է°���?�ϰ�?
import java.awt.event.KeyListener;//Ű�� �޴� ��

import javax.swing.ImageIcon; //imageicon ���� ���ؼ� �߰����־����
import javax.swing.JFrame; //JFrame �߰�
import javax.swing.JLabel; // JLabel �߰�

public class Moving extends JFrame{

	public static final int SCREEN_WIDTH = 1080;
	public static final int SCREEN_HEIGHT= 720;
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image intro;
	
	public void MyFrame() {
		
		setTitle("Test");//�� �������� ����ؼ� �������� 1,2,3�� ����� ������ �����Ǿ����!
		setLocationRelativeTo(null);//frame�� ����� ��ġ
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);//���̾ƿ� ����
		//�����ӿ� ����� ��ư�� ���� �� �ְ� �̸� �̿��ؼ� �����������̽� ��������
		Container c = getContentPane();
		//����̹����� ���ΰ� �̹��� ���ͼ� �ϸ� �ɵ�
		Toolkit tk = Toolkit.getDefaultToolkit();//�̹������Ͽ��� �̹����� �������� ������ ��
		intro = new ImageIcon("imgae/�ɸ��� ����.png").getImage();
		Image buffImg;
		Graphics gc;
		int x,y; //x�� y��ǥ�� ���� ���� 
		
		boolean keyUP = false;
		boolean keyDown = false;
		boolean keyLeft = false;
		boolean keyRight = false;
		boolean playerMove = false;//�⺻ ���¿� �̿��� Ű�� ������ �� bool������ �޾Ƶ鿩�� �޾Ƶ��̰� ����!
		setVisible(true);
		
		
		
		
	}
	
	
	
	
}
