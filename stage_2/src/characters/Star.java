package characters;

import java.io.*;

public class Star {

	//�̸� : ����� ����
	public String name;
	//ü�� : 0�� �Ǹ� ���� -- (��Ȱ?�ϰ� �̾�� || 3���������� �Ѿ��)
	public int HP;
	//���ݷ� : ��strength & ���ǵ�speed(->���õ�skill_lv)
	public int Power; 
	//��ø�� : �߰� ���� �� ����
	public int Agility;
	//������ : 1��-2��-3��
	public int Jump;
	
	//��
	public int money;
	//����(>��ų)
	//��(>��ų)
	//�弳 ����
	//���������� ȹ�� ����
	public boolean invincibility;
	
	//����� �̸� �Է�
	public void User() throws Exception {
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);	
		System.out.print("�̸� �Է�: ");
		name = inbr.readLine();
	}
	
	public void main(String[] args) throws Exception {
		User();
	}
}