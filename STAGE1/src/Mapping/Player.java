package Mapping;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
	private int x, y, tileX, tileY;
	
	private Image player;
	
	
	
	public Player(){
		
		ImageIcon img = new ImageIcon("image/케릭터 사진.png");
		player = img.getImage();
		
		//이거 사진크기로 생각하면서 설정하는 듯 ?
		x = 32;
		y = 32;
		tileX = 1;
		tileY = 1;
		
		
		
	}
	
	public Image getPlayer() {
		return player;
	}
	
	public int getX() {
		return x; //좌표값 리턴해주는듯 
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
		//왼쪽을 negative 오른쪽을 positive로 표현 
		x += dx;
		y += dy;
		//좌표설정하는 듯 ?
		tileX += tx;
		tileY += ty;
		
	}
	
	
	
	
	
}
