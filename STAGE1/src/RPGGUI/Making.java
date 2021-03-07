package RPGGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}


public class Making {

	private JFrame frame;
	
	static ImagePanel panel;
	static JPanel player;
	static ImagePanel enemy;
	static Human hero = new Warrior(200,150,1,0,50,10);
	static Slime slime = new Slime(4500,20);
	static JLabel lb_statement;
	static JButton btn_attack;
	static JButton btn_skill1;
	static JButton btn_skill2;
	static JButton btn_turnchange;
	static JButton btn_exit;
	static JProgressBar hp_bar_hero;
	static JProgressBar hp_bar_monster;
	static JProgressBar mp_bar;
	
	

	public static void main(String[] args) {
		
					
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Making window = new Making();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
				
	}

	public Making() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setSize(1280,720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		

		panel = new ImagePanel(new ImageIcon("./image/bg_forest.jpg").getImage());
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1280, 720);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		ImageIcon img_slime = new ImageIcon("./image/slime.gif");
		ImageIcon img_warrior = new ImageIcon("./image/warrior.png");
		
		JLabel lb_player = new JLabel(img_warrior);
		lb_player.setBounds(75, 215, 245, 245);
		panel.add(lb_player);
		
		
		JLabel lb_enemy = new JLabel(img_slime);
		lb_enemy.setBounds(898, 78, 245, 245);
		panel.add(lb_enemy);


		JLabel lb_enemyname = new JLabel("LV.1 슬라임\n");
		lb_enemyname.setForeground(Color.WHITE);
		lb_enemyname.setHorizontalAlignment(SwingConstants.CENTER);
		lb_enemyname.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lb_enemyname.setBounds(720, 80, 146, 109);
		panel.add(lb_enemyname);

		JLabel lb_playername = new JLabel("히어로\n");
		lb_playername.setForeground(Color.WHITE);
		lb_playername.setHorizontalAlignment(SwingConstants.CENTER);
		lb_playername.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lb_playername.setBounds(300, 200, 146, 109);
		panel.add(lb_playername);

		JPanel skill_panel = new JPanel();
		skill_panel.setBounds(75, 482, 1121, 184);
		skill_panel.setOpaque(false);
		panel.add(skill_panel);
		skill_panel.setLayout(null);
		
		ImageIcon icon_basicattack = new ImageIcon("./image/btn_basicattack.png");
		Image img_basicattack = icon_basicattack.getImage();
		Image changeImg_basicattack = img_basicattack.getScaledInstance(280, 180, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_basicattack = new ImageIcon(changeImg_basicattack);
		
		ImageIcon icon_basicattack2 = new ImageIcon("./image/btn_basicattack2.png");
		Image img_basicattack2 = icon_basicattack2.getImage();
		Image changeImg_basicattack2 = img_basicattack2.getScaledInstance(280, 180, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_basicattack2 = new ImageIcon(changeImg_basicattack2);
		
		btn_attack = new JButton(changeIcon_basicattack);
		btn_attack.setBounds(49, 0, 250, 150);
		btn_attack.setBackground(new Color(0,0,0,0));
		btn_attack.setBorderPainted(false);
		btn_attack.setContentAreaFilled(false);
		btn_attack.setFocusPainted(false);
		btn_attack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_attack.setIcon(changeIcon_basicattack2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_attack.setIcon(changeIcon_basicattack);
			}
		});
		skill_panel.add(btn_attack);
		
		ImageIcon icon_skill1 = new ImageIcon("./image/스킬1.png");
		Image img_skill1 = icon_skill1.getImage();
		Image changeImg_skill1 = img_skill1.getScaledInstance(280, 180, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_skill1 = new ImageIcon(changeImg_skill1);
		
		ImageIcon icon_skill1_2 = new ImageIcon("./image/스킬1-2.png");
		Image img_skill1_2 = icon_skill1_2.getImage();
		Image changeImg_skill1_2 = img_skill1_2.getScaledInstance(280, 180, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_skill1_2 = new ImageIcon(changeImg_skill1_2);
		
	    btn_skill1 = new JButton(changeIcon_skill1);
		btn_skill1.setFont(new Font("돋움", Font.PLAIN, 20));
		btn_skill1.setBounds(436, 0, 250, 150);
		btn_skill1.setBackground(new Color(0,0,0,0));
		btn_skill1.setBorderPainted(false);
		btn_skill1.setContentAreaFilled(false);
		btn_skill1.setFocusPainted(false);
		btn_skill1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_skill1.setIcon(changeIcon_skill1_2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_skill1.setIcon(changeIcon_skill1);
			}
		});
		skill_panel.add(btn_skill1);
		
		ImageIcon icon_skill2 = new ImageIcon("./image/스킬2.png");
		Image img_skill2 = icon_skill2.getImage();
		Image changeImg_skill2 = img_skill2.getScaledInstance(280, 180, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_skill2 = new ImageIcon(changeImg_skill2);
		
		ImageIcon icon_skill2_2 = new ImageIcon("./image/스킬2-2.png");
		Image img_skill2_2 = icon_skill2_2.getImage();
		Image changeImg_skill2_2 = img_skill2_2.getScaledInstance(280, 180, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_skill2_2 = new ImageIcon(changeImg_skill2_2);

		btn_skill2 = new JButton(changeIcon_skill2);
		btn_skill2.setFont(new Font("돋움", Font.PLAIN, 20));
		btn_skill2.setBounds(859, 0, 250, 150);
		btn_skill2.setBackground(new Color(0,0,0,0));
		btn_skill2.setBorderPainted(false);
		btn_skill2.setContentAreaFilled(false);
		btn_skill2.setFocusPainted(false);
		btn_skill2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_skill2.setIcon(changeIcon_skill2_2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_skill2.setIcon(changeIcon_skill2);
			}
		});
		skill_panel.add(btn_skill2);
		
		lb_statement = new JLabel();
		lb_statement.setForeground(Color.WHITE);
		lb_statement.setHorizontalAlignment(SwingConstants.CENTER);
		lb_statement.setLabelFor(panel);
		lb_statement.setBackground(Color.CYAN);
		lb_statement.setFont(new Font("돋움", Font.PLAIN, 20));
		lb_statement.setBounds(454, 301, 372, 140);
		panel.add(lb_statement);
		battle(hero, slime);
	}
	
		
	public static void battle(Human hero, Monster monster) {
		lb_statement.setText("앗 야생의 슬라임이 나타났다!");
		Warrior temp = (Warrior)hero;
		Slime temp2 = (Slime)monster;
		
		hp_bar_hero = new JProgressBar(0,hero.Health);
		hp_bar_hero.setBounds(345,275,200,25);
		hp_bar_hero.setForeground(Color.red);
		hp_bar_hero.setValue(hero.Health);
		panel.add(hp_bar_hero);
		
		mp_bar = new JProgressBar(0,hero.Mana);
		mp_bar.setBounds(345,300,200,15);
		mp_bar.setForeground(Color.cyan);
		mp_bar.setValue(hero.Mana);
		panel.add(mp_bar);
		
		hp_bar_monster = new JProgressBar(0,monster.Health);
		hp_bar_monster.setBounds(735,150,200,25);
		hp_bar_monster.setForeground(Color.red);
		hp_bar_monster.setValue(monster.Health);
		panel.add(hp_bar_monster);
		
		
		ImageIcon icon_turnchange = new ImageIcon("./image/btn_turnchange.png");
		Image img_turnchange = icon_turnchange.getImage();
		Image changeImg_turnchange = img_turnchange.getScaledInstance(259, 139, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_turnchange = new ImageIcon(changeImg_turnchange);
		
		ImageIcon icon_turnchange2 = new ImageIcon("./image/btn_turnchange2.png");
		Image img_turnchange2 = icon_turnchange2.getImage();
		Image changeImg_turnchange2 = img_turnchange2.getScaledInstance(259, 139, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_turnchange2 = new ImageIcon(changeImg_turnchange2);
		
		btn_turnchange = new JButton(changeIcon_turnchange);
		btn_turnchange.setBounds(934, 333, 259, 139);
		btn_turnchange.setBackground(new Color(0,0,0,0));
		btn_turnchange.setBorderPainted(false);
		btn_turnchange.setContentAreaFilled(false);
		btn_turnchange.setFocusPainted(false);
		btn_turnchange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_turnchange.setIcon(changeIcon_turnchange2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_turnchange.setIcon(changeIcon_turnchange);
			}
		});
		panel.add(btn_turnchange);
		btn_turnchange.setVisible(false);
		
		ImageIcon icon_exit = new ImageIcon("./image/나가기.png");
		Image img_exit = icon_exit.getImage();
		Image changeImg_exit = img_exit.getScaledInstance(259, 139, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_exit = new ImageIcon(changeImg_exit);
		
		ImageIcon icon_exit2 = new ImageIcon("./image/나가기2.png");
		Image img_exit2 = icon_exit2.getImage();
		Image changeImg_exit2 = img_exit2.getScaledInstance(259, 139, Image.SCALE_SMOOTH);
		ImageIcon changeIcon_exit2 = new ImageIcon(changeImg_exit2);
		
		btn_exit = new JButton(changeIcon_exit);
		btn_exit.setBounds(934, 333, 259, 139);
		btn_exit.setBackground(new Color(0,0,0,0));
		btn_exit.setBorderPainted(false);
		btn_exit.setContentAreaFilled(false);
		btn_exit.setFocusPainted(false);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_exit.setIcon(changeIcon_exit2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_exit.setIcon(changeIcon_exit);
			}
		});
		panel.add(btn_exit);
		btn_exit.setVisible(false);
		
		btn_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btn_turnchange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(monster.Health<=0) {
					btn_turnchange.setVisible(false);
					btn_exit.setVisible(true);
				}
				else if(hero.Health<=0) {
					btn_turnchange.setVisible(false);
					btn_exit.setVisible(true);
				}
				else {
					Random random = new Random();
					int skillM = random.nextInt(2);
					if(skillM == 1) {
						temp2.skill1(hero, monster.Power);
					}
					else
						monster.AttackM(hero, monster.Power);
					btn_turnchange.setVisible(false);
				}
			}
		});
		
			
		
		btn_attack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				temp.BasicAttack(monster, hero.Job);
				btn_turnchange.setVisible(true);
			}
		});
		
		btn_skill1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				temp.SwordDancing(monster, hero.Level);
				btn_turnchange.setVisible(true);
			}
		});
		
		btn_skill2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				temp.Chopping(monster, hero.Level);
				btn_turnchange.setVisible(true);
			}
		});
					
	}
}

