package star_v1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player; //JLayer

public class Music extends Thread { // Thread: �ϳ��� ���� ���α׷� (���� ���α׷� ����� ������ ���� ����ϴ� ���α׷�)

	private Player player;
	private boolean isLoop; // �ݺ�or��ȸ
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
			System.out.println(e.getMessage()); // �ش� ���� �޼��� ���
		}
	}

	// 0.001�ʴ����� ���� ��ġ ����
	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();
	}

	// ���� ����
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); // �ش� Thread ����
	}

	@Override
	public void run() { // run : Thread�� ��� �޾��� �� ������ ����ؾ��ϴ� �Լ�
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
