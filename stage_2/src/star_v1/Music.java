package star_v1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player; //JLayer

public class Music extends Thread { // Thread: 하나의 작은 프로그램 (게임 프로그램 실행과 별도로 곡을 재생하는 프로그램)

	private Player player;
	private boolean isLoop; // 반복or일회
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) { 
			System.out.println(e.getMessage()); // 해당 오류 메세지 출력
		}
	}

	// 0.001초단위로 실행 위치 리턴
	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();
	}

	// 음악 종료
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); // 해당 Thread 중지
	}

	@Override
	public void run() { // run : Thread를 상속 받았을 때 무조건 사용해야하는 함수
		try {
			do {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while (isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
