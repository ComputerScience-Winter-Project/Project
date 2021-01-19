package settings;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Moving_Text extends JFrame {
	
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("Star");
	final int MOVING_UNIT = 10;
	
	Moving_Text () {
		setTitle("키보드 조작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener()); //키이벤트 등록
		la.setLocation(50,50); //위치
		la.setSize(100,20); //크기
		contentPane.add(la);
		setSize(300,300); //프레임크기
		setVisible(true); 
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		//키 하나 : 키를 눌렀을 때 고려
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			//방향키
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - MOVING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + MOVING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - MOVING_UNIT , la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + MOVING_UNIT , la.getY());
				break;
		/*
			case KeyEvent.VK_SPACE:
				System.out.println("SPACE점프");
				break;
			//공격키
			case KeyEvent.VK_D:
				System.out.println("D공격");
				break;				
			//스킬키
			case KeyEvent.VK_S:
				System.out.println("S금");
				break;
			case KeyEvent.VK_A:
				System.out.println("A화");
				break;
			case KeyEvent.VK_W:
				System.out.println("W목");
				break;
			case KeyEvent.VK_E:
				System.out.println("E토");
				break;
			case KeyEvent.VK_R:
				System.out.println("R지");
				break;
			//아이템||무기||방어구||돈 획득
			case KeyEvent.VK_F:
				System.out.println("F획득");
				break;
			//아이템 사용키
			case KeyEvent.VK_Q:
				System.out.println("Q무적");
				break;
			case KeyEvent.VK_TAB:
				System.out.println("TAB욕설");
				break;
		*/
			}
		}
		
		//키 둘 (이동키 + 공격키/스킬키) : 키를 뗐을 때 고려
		public void keyReleased(KeyEvent e) {}
	}
	
	public static void main(String[] args) {
		new Moving_Text();
	}
}
