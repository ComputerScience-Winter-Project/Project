
public class Human {
	//�����Դϴ�.
	//����̸��� ������
	//ü�� ,���� ,����
	int Health; //�������� �ٸ��� ����--ex)����� ü���� ������ ���� ���� ,����� ü���� ������ ���̰���, �ü��� �� �� �ݹ�
	int Mana;
	int Level=0; //�ϴ��� ���� �� ������ 1�� ������ ���� ��!
	int Job;//0�� ����, 1�� �ü�, 2�� ����

	public void AttackH(Monster Name,int Damage) {
		Name.Health -= Damage;
		//�̸��� �޾Ƽ� �� �ȿ� �ִ� �ν��ͽ��� ü���� ��µ� ���� ��������ŭ
		//�Է¹��� ��������ŭ ������ ü���� ����
		//������ ü���� ��ƾ��ϱ� ������ ���� �߿���
		//����� �Է¹ް� ����� ü���� ���������� �����ؼ� �� ü���� ��� ���� static ���
	}
	public void BasicAttack(Monster Name,int Job) {
		//�������� ����������ؼ� punch�� ���Խ�Ŵ
		int Punch = 0;
		switch(Job) {
		case  1 : //������ ���
			Punch = 400 + Level *100;
		case 2 : //�ü��� ���
			Punch = 600 + Level *150;
		case 3 :
			Punch = 200 + Level *100;
		}
		AttackH(Name,Punch);
		}
	
}