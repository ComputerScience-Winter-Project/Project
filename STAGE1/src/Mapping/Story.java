package Mapping;

import javax.swing.*;



public class Story {
	public static void main(String[] args) {
	 new Story();
	}



	public Story() {
		JFrame f = new JFrame();
		f.setTitle("¸Ê ¿¬½À¿ë");
		f.add(new Board());
		f.setSize(1280,800);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}	
	}
	
	