
public class Warrior extends Human {
	//���������� ������ ���
	//�⺻���� �޼ҵ�� ����Ŭ����
	//�����̱� ������ ü���� ����
	//�θ�Ŭ����---ü���̶� ������ ���� ������ ��������--�θ�Ŭ������ �������� 
	
	public  void SwordDancing(int Strength) //Strength==���������Ҷ����ٸ� ����
	{
		int Power = Strength*200;
		
	     Attack(Power);
		//Attack �Լ��� ���� �����ϴ� �Լ��� �ؿ��� gui�� ���ݾ��� ���� ����
		//���� e���� ����

			
		}
		
	public void  Chopping(int Strength){//������
		int Power = Strength*120;
		
		Attack(Power);
		
	}
	
}
