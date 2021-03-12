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
		while(m.hasNext()) {//���״�� ���� �ܾ ���������� �޾Ƶ��� !!
			for(int i =0; i < 40;i++ ) {
				Map[i] = m.next();
				//Map�� ��� �����Ű�� �� scanner�� txt�о
				//scanner�� �о�ڴ�. 
				//�� ���簢�� ��縸 �о�°ɱ�??????????????????/?
				//�̰� ������ ���簢�����θ� �о�� �� ���簢������ ���� �� �ִ� ��� �����س��°� �߿��ҵ� �ƴϸ� �� �κп� �������̽��� ä���� ��ġ�� �͵� �ϳ��� ���
			}
		}
	}
	
	public void closeFile() {
		m.close();
	}
	
}