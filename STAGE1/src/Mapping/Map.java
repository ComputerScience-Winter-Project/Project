package Mapping;

import java.awt.Image;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;



public class Map {
	
	private Scanner m;

	private String Map[] = new String[40]; 
	
	private Image grass, slime,tree;
	
	public Map() {
		
		ImageIcon img = new ImageIcon("image/grass2.png");
		grass = img.getImage();
		ImageIcon img2 = new ImageIcon("image/slime2.png");
		
		slime = img2.getImage();
		ImageIcon img3 = new ImageIcon("image/fortree.png");
		tree = img3.getImage();
		openFile();
		readFile();
		closeFile();
		
	}
	
	public Image getGrass() {
		return grass;
	}
	
	public Image getSlime() {
		return slime;
	}
	public Image getTree() {
		return tree;
	}
	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x + 1);
		return index;
		
	}
	
	
	
	public void openFile() {
		
		try {
			m = new Scanner(new File("image/map.txt"));
			
		}catch(Exception e) {
			System.out.println("error loading map");
			
		}
		
	}
	
	public void readFile() {
		while(m.hasNext()) {//말그대로 옆에 단어가 있을때까지 받아들임 !!
			for(int i =0; i < 40;i++ ) {
				Map[i] = m.next();
				//Map에 계속 저장시키는 중 scanner로 txt읽어서
				//scanner로 읽어내겠다. 
				//왜 정사각형 모양만 읽어내는걸까??????????????????/?
				//이거 때문에 정사각형으로만 읽어내는 듯 직사각형으로 읽을 수 있는 방법 생각해내는게 중요할듯 아니면 그 부분에 인터페이스를 채워서 고치는 것도 하나의 방법
			}
		}
	}
	
	public void closeFile() {
		m.close();
	}
	
}