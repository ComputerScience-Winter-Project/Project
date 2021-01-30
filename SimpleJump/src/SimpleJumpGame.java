import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class SimpleJumpGame extends JFrame implements KeyListener, JumpListener, Debuggable, MouseListener {

	
	int mode=MODE_DEBUG;
	
	String VERSION="0.1.0";
	
    int BOTTOM_Y=170;
    
    int lastPressedKeyCode=-1;
    
    JumpThread jumpThread; 
    
    Character character;

    public SimpleJumpGame() {
     
    	this.setTitle ("Simple Jump Game (ver " + VERSION + ")") ; 
	    this.setResizable (false); 
	           
	    try {
	    	this.character=new Character(this); 
	    }
	    catch (Exception _e) {
	    	debug("Error on character loading.. ");
	    	System.exit(1);
	    }
	    
	    this.character.setX(50); 
	    this.character.setY(BOTTOM_Y- this.character.getHeight()); 
	    	
	    addKeyListener(this);
	    addMouseListener(this);
	    this.addWindowListener(new Exit());	    
	}
    
    
    public void paint(Graphics g)
    {
    	super.paint(g);
    	g.drawLine(0,BOTTOM_Y, this.getWidth(), BOTTOM_Y);
    	g.setColor(Color.black);
    	String info="name ";
    	g.drawString(info, 10 , 45);
    	
    	g.setColor(Color.blue);
    	String info2="ex";
    	g.drawString(info2, 10 , 60);
    	
    	g.drawImage(this.character.getImageIcon().getImage(), this.character.getX(), this.character.getY(), null);    	
    }

    public void keyPressed(KeyEvent e) {
    	debug("pressed=" + e.getKeyCode());
       	this.lastPressedKeyCode=e.getKeyCode();
    	
     	if (this.character.isJumping()) {
     		return;
     	}
     	
     	if (e.getKeyCode()==e.VK_LEFT) {
            this.character.addX(-4);
            if (this.character.getX()<0) this.character.setX(0);
            this.character.setJumpDirection(-1);
        }
        else if (e.getKeyCode()==e.VK_RIGHT) {
        	this.character.addX(4);
            if (this.character.getX()> (this.getWidth()- this.character.getWidth())) 
            	this.character.setX(this.getWidth()- this.character.getWidth());
            this.character.setJumpDirection(1);
        }
        else if (e.getKeyCode()==e.VK_SPACE) {
        	new JumpThread(this).start();
        }        
        
        repaint();
    }
    
    
    public void keyReleased(KeyEvent e) {
    	debug("realease=" + e.getKeyCode());
    }
    
    
    public void keyTyped(KeyEvent e ) {
    	debug("typed=" + e.getKeyChar());
    }


	public void jumpTimeArrived(int jumpIdx, int jumpy) {
		debug("jumpidx=" + jumpIdx + ", jumpy=" + jumpy);
		this.character.addX(this.character.getJumpDirection()*5);
		this.character.addY(jumpy);

		if (this.character.getX()<0) this.character.setX(0);
		if (this.character.getX()> (this.getWidth()- this.character.getWidth())) 
        	this.character.setX(this.getWidth()- this.character.getWidth());

		
		this.character.setJumpIdx(jumpIdx);
		repaint();
	}
	
	public void jumpTimeEnded() {
		this.character.setJumpIdx(0);
		repaint();
	}
	
	public void debug(String s) {
		if (this.mode==MODE_DEBUG) System.out.println(s);
	}
	
    public static void main(String[] args) {
    	SimpleJumpGame frame = new SimpleJumpGame();
    	frame.setSize(600,200);
        frame.setVisible(true);
    }
    
	class Exit extends WindowAdapter  {
	 
      public void windowClosing(WindowEvent e) // WindowAdapter class Overriding
      {
        dispose();
        System.exit(0); 
      }   
	}
	
	public void openBrower(String url)  {
		java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

        if( !desktop.isSupported( java.awt.Desktop.Action.BROWSE ) ) {
            System.err.println( "Desktop doesn't support web browser action" );
        }
        try {
            java.net.URI uri = new java.net.URI( url );
            desktop.browse( uri );
        }        
        catch (IOException _e) {
            System.err.println( _e.getMessage() );
        } 
        catch (URISyntaxException _e) {
            System.err.println( _e.getMessage() );
        }
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		/*
		debug("mouseClicked x=" + me.getX() + ", y=" + me.getY());
		if (me.getX()<170 && me.getY()<60 && me.getY()>50) {
			String url="http://www.naver.com";
			openBrower(url);
		}
		*/
	}
	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
    
}


 