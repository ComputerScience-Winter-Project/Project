import java.awt.Container;
import java.awt.event.KeyEvent;//Ű�� �Է°���?�ϰ�?
import java.awt.event.KeyListener;//Ű�� �޴� ��
import javax.swing.JFrame; //JFrame �߰�
import javax.swing.JLabel; // JLabel �߰�

public class Moving extends JFrame{

	public void MyFrame() {
		
		setTitle("Test");//�� �������� ����ؼ� �������� 1,2,3�� ����� ������ �����Ǿ����!
		setLocationRelativeTo(null);//frame�� ����� ��ġ
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);//���̾ƿ� ����
		//�����ӿ� ����� ��ư�� ���� �� �ְ� �̸� �̿��ؼ� �����������̽� ��������
		Container c = getContentPane();
		//����̹����� ���ΰ� �̹��� ���ͼ� �ϸ� �ɵ�
	}
	
	
	
	
}
