package star_v1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; //GUI
import javax.swing.JLabel;

public class StarStage2 extends JFrame {

	// 더블버퍼링: 이미지를 매순간 갱신
	private Image screenImage;
	private Graphics screenGraphic;
	// 이미지
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exit(1).png"));
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exit(2).png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/gamePlay.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/gamePlayEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/gameQuit.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/gameQuitEntered.png"));
	private ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButton.png"));
	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png"));
	private ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButton.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../images/rightButtonEntered.png"));

	
	private Image titleImage = new ImageIcon(Main.class.getResource("../images/optionplanetTitle1.png")).getImage();
	private Image selectedImage = new ImageIcon(Main.class.getResource("../images/optionplanet1.jpg")).getImage();
	
	
	
	// 시작 배경화면 // 해당 이미지를 Background에 불러온다.
	private Image Background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	// 메뉴바
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	
	// 버튼 초기화
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton leftButton = new JButton(leftButtonBasicImage);
	private JButton rightButton = new JButton(rightButtonBasicImage);

	// 메뉴바 마우스
	private int mouseX, mouseY;
	private boolean isMainScreen = false;
	// version
	String VERSION = "1.0";


/*
	//Track
	ArrayList<Track> trackList = new ArrayList<Track>();
	private Image titleImage;
	private Image selectedImage;
	private int nowSelected = 0; //0번 트랙부터
*/
	
	
	// 생성자: StarStage2 실행 시 가장 먼저 실행된다.
	public StarStage2() {
		
		setUndecorated(true); // 안보이게
		// 창 설정
		setTitle("StarStage2 (ver " + VERSION + ")"); // Title
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 창 크기
		setResizable(false); // 창 크기 고정
		setLocationRelativeTo(null); // 창 위치를 화면의 가운데로 시작
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료
		setVisible(true); // 화면에 프로그램 출력
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		// Intro 배경음악 설정 >> 게임 시작 시 close 해주기!
		Music introMusic = new Music("intromusic.mp3", true); // 해당 곡을 무한루프(true)로 재생하도록 introMusic에 불러온다. --- final?!?!?!?!
		introMusic.start(); 
		
/*
		//Track: titleImage, startImage, gameImage, gameMusic
		//행성별 gameMusic 바꿔주기!
		//trackList.add(new Track("optionplanetTitle1.png","optionplanet1.jpg","planet1.jpg","intromusic.mp3"));
		trackList.add(new Track("optionplanetTitle2.png","optionplanet2.jpg","planet2.jpg","intromusic.mp3"));
		trackList.add(new Track("optionplanetTitle3.png","optionplanet3.jpg","planet3.jpg","intromusic.mp3"));
		trackList.add(new Track("optionplanetTitle4.png","optionplanet4.jpg","planet4.jpg","intromusic.mp3"));
		trackList.add(new Track("optionplanetTitle5.png","optionplanet5.jpg","planet5.jpg","intromusic.mp3"));
*/
		
		
		// Menu Bar Exit Button
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 손가락 모양으로
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("ButtonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(exitButton);

		// start Button
		startButton.setBounds(930, 530, 100, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 손가락 모양으로
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("ButtonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
			//selectTrack(0);				
				startButton.setVisible(false);
				quitButton.setVisible(false);
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				Background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
				isMainScreen = true;
				// 게임 시작

			}
		});
		add(startButton);

		// quit Button
		quitButton.setBounds(1080, 530, 100, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 손가락 모양으로
			}

			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("ButtonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(quitButton);

		// left Button
		leftButton.setVisible(false);
		leftButton.setBounds(140, 310, 60, 60);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setIcon(leftButtonEnteredImage);
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 손가락 모양으로
			}

			@Override
			public void mouseExited(MouseEvent e) {
				leftButton.setIcon(leftButtonBasicImage);
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("ButtonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
			//selectLeft();
			}
		});
		add(leftButton);

		// right Button
		rightButton.setVisible(false);
		rightButton.setBounds(1080, 310, 60, 60);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setIcon(rightButtonEnteredImage);
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 손가락 모양으로
			}

			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(rightButtonBasicImage);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("ButtonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
			//selectRight();
			}
		});
		add(rightButton);

		
		// 메뉴바
		menuBar.setBounds(0, 0, 1280, 30); // 크기
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // 마우스 클릭 사용 시
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) { // 마우스 드래그 사용 시
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);

	}

	// paint : JFrame을 상속받은 GUI에서 제일 처음으로 화면을 그려주는 메소드
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	// draw -> re paint
	public void screenDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null); // 역동적: 이미지 출력
		if (isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 340, 550, null);
		}
		paintComponents(g); // 고정적: 이미지 요소 '추가'

		this.repaint();
	}
	
	
/*
	public void selectTrack(int nowSelected) {
		titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage())).getImage();
		selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage())).getImage();
	}
	
	public void selectLeft() {
		if (nowSelected == 0) { //0번트랙에서 left 선택 시
			nowSelected = trackList.size() - 1; //가장 오른쪽 곡(5번트랙)이 선택된다.
		}
		else {
			nowSelected--;
		}
		selectTrack(nowSelected);
	}
	
	public void selectRight() {
		if (nowSelected == trackList.size() - 1) { //0번트랙에서 left 선택 시
			nowSelected = 0; //가장 오른쪽 곡(5번트랙)이 선택된다.
		}
		else {
			nowSelected++;
		}
		selectTrack(nowSelected);
	}
*/
	
	public void gameStart(int nowSelected) {
		isMainScreen = false;
		leftButton.setVisible(false);
		rightButton.setVisible(false);
	}
	
}
