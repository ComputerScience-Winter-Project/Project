import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;//키를 입력가능?하게?
import java.awt.event.KeyListener;//키를 받는 것

import javax.swing.ImageIcon; //imageicon 쓰기 위해선 추가해주어야함
import javax.swing.JFrame; //JFrame 추가
import javax.swing.JLabel; // JLabel 추가

public class Moving extends JFrame{

	public static final int SCREEN_WIDTH = 1080;
	public static final int SCREEN_HEIGHT= 720;
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image intro;
	
	public void MyFrame() {
		
		setTitle("Test");//이 프레임은 계속해서 스테이지 1,2,3이 진행될 때까지 유지되어야함!
		setLocationRelativeTo(null);//frame을 가운데에 배치
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);//레이아웃 설정
		//프레임에 충분히 버튼을 넣을 수 있고 이를 이용해서 전투인터페이스 생성가능
		Container c = getContentPane();
		//배경이미지와 주인공 이미지 따와서 하면 될듯
		Toolkit tk = Toolkit.getDefaultToolkit();//이미지파일에서 이미지를 가져오는 역할을 함
		intro = new ImageIcon("imgae/케릭터 사진.png").getImage();
		Image buffImg;
		Graphics gc;
		int x,y; //x와 y좌표를 받을 변수 
		
		boolean keyUP = false;
		boolean keyDown = false;
		boolean keyLeft = false;
		boolean keyRight = false;
		boolean playerMove = false;//기본 상태와 이외의 키를 눌렀을 때 bool형으로 받아들여서 받아들이게 해줌!
		setVisible(true);
		
		
		
		
	}
	
	
	
	
}
