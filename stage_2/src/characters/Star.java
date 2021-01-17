package characters;

import java.io.*;

public class Star {

	//이름 : 사용자 설정
	public String name;
	//체력 : 0이 되면 잡힘 -- (부활?하고 이어가기 || 3스테이지로 넘어가기)
	public int HP;
	//공격력 : 힘strength & 스피드speed(->숙련도skill_lv)
	public int Power; 
	//민첩도 : 추격 경찰 수 조절
	public int Agility;
	//점프력 : 1단-2단-3단
	public int Jump;
	
	//돈
	public int money;
	//무기(>스킬)
	//방어구(>스킬)
	//욕설 포션
	//무적아이템 획득 여부
	public boolean invincibility;
	
	//사용자 이름 입력
	public void User() throws Exception {
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);	
		System.out.print("이름 입력: ");
		name = inbr.readLine();
	}
	
	public void main(String[] args) throws Exception {
		User();
	}
}