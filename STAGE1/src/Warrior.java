
public class Warrior extends Human {
	//���������� ������ ���
	//�⺻���� �޼ҵ�� ����Ŭ����
	//�����̱� ������ ü���� ����
	//�θ�Ŭ����---ü���̶� ������ ���� ������ ��������--�θ�Ŭ������ �������� 
	//�����Ҹ� �־������
	public  void SwordDancing(Monster Name,int Level) //Strength==���������Ҷ����ٸ� ����
	{
		int Power = Level* 800 ;
		
	     AttackH(Name,Power);
		//Attack �Լ��� ���� �����ϴ� �Լ��� �ؿ��� gui�� ���ݾ��� ���� ����
		//���� e���� ����

			
		}
		
	public void  Chopping(Monster Name, int Level){//������
		int Power = Level*600;
		
		AttackH(Name, Power);
		
	}
	
}
