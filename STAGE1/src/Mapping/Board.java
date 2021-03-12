package Mapping;

import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Board extends JPanel implements ActionListener {
	private Timer timer;
	private Map m;
	private Player p;
	Graphics gc;
	public Board() {
	
		m = new Map();
		p = new Player();
		addKeyListener(new Al());
		setFocusable(true);
		//System.out.println("안녕하세요");
		timer = new Timer(25,this);//단위는 밀리세컨드
		timer.start();//시간이 지나면 초기화해주는 것
		
	}
	
	public void DrawImg() {
		gc.setFont(new Font("Default",Font.BOLD,20));
		
		//gc.drawString(Integer.toString(p.x), 220, 80);
		//gc.drawString(Integer.toString(p.y), 270, 80);
	}
	
	
	public void  paint(Graphics g) {
		super.paint(g);
		
		for(int y = 0; y<40; y++  ) {
			for(int x = 0 ; x<40;x++) {
				if(m.getMap(x, y).equals("a")){
					g.drawImage(m.getGrass(), x*32,y*32,null);			
					}
				if(m.getMap(x,y).equals("s")) {
					g.drawImage(m.getSlime(), x*32 , y*32,null);					}
				
				if(m.getMap(x,y).equals("t")) {
					g.drawImage(m.getTree(), x*32 , y*32,null);					}
				
			}
			
		}
		g.drawImage(p.getPlayer(), p.getX(), p.getY(),null);		
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	public class Al extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			
			if(keycode == KeyEvent.VK_W) {
				p.move(0, -32, 0, -1);
				
				
			}
			if(keycode == KeyEvent.VK_S) {
				p.move(0, 32,0,1);
				
			}
			if(keycode == KeyEvent.VK_A) {
				p.move(-32, 0, -1 , 0);
				
			}
			if(keycode == KeyEvent.VK_D) {
				p.move(32, 0 , 1, 0);
				
			}
			
			
			
		}
		public void keyReleased(KeyEvent e) {
			 
		}
		public void keyTyped(KeyEvent e) {
		
		}
		
		
	}
	
	
}
