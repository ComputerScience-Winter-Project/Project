package Mapping;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
	private int x, y, tileX, tileY;
	
	private Image player;
	
	
	
	public Player(){
		
		ImageIcon img = new ImageIcon("image/�ɸ��� ����.png");
		player = img.getImage();
		
		//�̰� ����ũ��� �����ϸ鼭 �����ϴ� �� ?
		x = 32;
		y = 32;
		tileX = 1;
		tileY = 1;
		
		
		
	}
	
	public Image getPlayer() {
		return player;
	}
	
	public int getX() {
		return x; //��ǥ�� �������ִµ� 
	}
	public int getY() {
		return y;	
	}
	public int gettileX() {
		return tileX;
	}
	public int gettileY() {
		return tileY;
	}
	public void move(int dx, int dy,int tx, int ty) {
		//������ negative �������� positive�� ǥ�� 
		x += dx;
		y += dy;
		//��ǥ�����ϴ� �� ?
		tileX += tx;
		tileY += ty;
		
	}
	
	
	
	
	
}
