import java.awt.Container;
import java.awt.event.KeyEvent;//키를 입력가능?하게?
import java.awt.event.KeyListener;//키를 받는 것
import javax.swing.JFrame; //JFrame 추가
import javax.swing.JLabel; // JLabel 추가

public class Moving extends JFrame{

	public void MyFrame() {
		
		setTitle("Test");//이 프레임은 계속해서 스테이지 1,2,3이 진행될 때까지 유지되어야함!
		setLocationRelativeTo(null);//frame을 가운데에 배치
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);//레이아웃 설정
		//프레임에 충분히 버튼을 넣을 수 있고 이를 이용해서 전투인터페이스 생성가능
		Container c = getContentPane();
		//배경이미지와 주인공 이미지 따와서 하면 될듯
	}
	
	
	
	
}
