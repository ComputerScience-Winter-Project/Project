
public class Warrior extends Human {
	//���������� ������ ���
	//�⺻���� �޼ҵ�� ����Ŭ����
	//�����̱� ������ ü���� ����
	//�θ�Ŭ����---ü���̶� ������ ���� ������ ��������--�θ�Ŭ������ �������� 
	
	public  void SwordDancing(Monster Name,int Strength) //Strength==���������Ҷ����ٸ� ����
	{
		int Power = Strength*200;
		
	     AttackH(Name,Power);
		//Attack �Լ��� ���� �����ϴ� �Լ��� �ؿ��� gui�� ���ݾ��� ���� ����
		//���� e���� ����

			
		}
		
	public void  Chopping(Monster Name, int Strength){//������
		int Power = Strength*120;
		
		AttackH(Name, Power);
		
	}
	
}
