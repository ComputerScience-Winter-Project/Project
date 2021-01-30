import javax.swing.ImageIcon;

public class Character {

	int x = 50;
    
    int y;
    
	boolean isRight;
	
	int imageNum;
	
	public static int IMAGENUM_SIZE=8;
	
	ImageIcon[] icons=new ImageIcon[IMAGENUM_SIZE];
	
	int height;
	
	int width;
	
	int jumpdirection=0; 
    
    int jumpIdx=0;
    
	Debuggable debuggable;
	
	public Character(Debuggable debuggable) {
		
		this.debuggable=debuggable;
		
		for (int i=0;i<IMAGENUM_SIZE;++i) {
			String path="images\\man" + i + ".png";
			this.debuggable.debug(path);
			this.icons[i]=new ImageIcon(path);
		}
		this.width=this.icons[0].getIconWidth();
		this.height=this.icons[0].getIconHeight();
	}

	
	public ImageIcon getImageIcon() {
		
		switch (this.jumpIdx) {
			case 0:
				return this.icons[0];
				
			case 1:
				return this.icons[1];
				
			case 2:
				return this.icons[1];
				
			case 3:
				return this.icons[1];
				
			case 4:
				return this.icons[2];
				
			case 5:
				return this.icons[3];
				
			case 6:
				return this.icons[3];
				
			case 7:
				return this.icons[3];
			
			case 8:
				return this.icons[4];
			
			case 9:
				return this.icons[5];
			
			
			default:
				return this.icons[0];
		}
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getJumpIdx() {
		return this.jumpIdx;
	}
	
	public void setJumpIdx(int jumpIdx) {
		this.jumpIdx=jumpIdx;
	}
	
	public int getJumpDirection() {
		return this.jumpdirection;
	}
	
	public void setJumpDirection (int jumpDirection) {
		this.jumpdirection=jumpDirection;
	}
	
	public boolean isJumping() {
		if (this.jumpIdx==0) return false;
		return true;
	}

	public void addX(int add) {
		this.x+=add;
	}
	
	public void addY(int add) {
		this.y+=add;
	}
	
	public void setX(int x) {
		this.x=x;		
	}

	public void setY(int y) {
		this.y=y;
	}	
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
