import java.awt.Container;
import javax.swing.*;
public class Frame_make extends JFrame{
	Frame_make() {
		setTitle("첫번째 프레임");
		setSize(1500, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame_make();
	}

}
