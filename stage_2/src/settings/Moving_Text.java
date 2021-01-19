package settings;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Moving_Text extends JFrame {
	
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("Star");
	final int MOVING_UNIT = 10;
	
	Moving_Text () {
		setTitle("Ű���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener()); //Ű�̺�Ʈ ���
		la.setLocation(50,50); //��ġ
		la.setSize(100,20); //ũ��
		contentPane.add(la);
		setSize(300,300); //������ũ��
		setVisible(true); 
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		//Ű �ϳ� : Ű�� ������ �� ���
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			//����Ű
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
				System.out.println("SPACE����");
				break;
			//����Ű
			case KeyEvent.VK_D:
				System.out.println("D����");
				break;				
			//��ųŰ
			case KeyEvent.VK_S:
				System.out.println("S��");
				break;
			case KeyEvent.VK_A:
				System.out.println("Aȭ");
				break;
			case KeyEvent.VK_W:
				System.out.println("W��");
				break;
			case KeyEvent.VK_E:
				System.out.println("E��");
				break;
			case KeyEvent.VK_R:
				System.out.println("R��");
				break;
			//������||����||��||�� ȹ��
			case KeyEvent.VK_F:
				System.out.println("Fȹ��");
				break;
			//������ ���Ű
			case KeyEvent.VK_Q:
				System.out.println("Q����");
				break;
			case KeyEvent.VK_TAB:
				System.out.println("TAB�弳");
				break;
		*/
			}
		}
		
		//Ű �� (�̵�Ű + ����Ű/��ųŰ) : Ű�� ���� �� ���
		public void keyReleased(KeyEvent e) {}
	}
	
	public static void main(String[] args) {
		new Moving_Text();
	}
}
