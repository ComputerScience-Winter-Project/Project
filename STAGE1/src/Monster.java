
public class Monster {
	
	//ü���̶� ����--������ �׳� �⺻���ݸ�
	//���͸��� ü���̶� �⺻ ���ݷ��� �ٸ�
	int Health;
	int Power;
	public void AttackM(Human name,int damage) {
		name.Health -= damage;
		
		//������� ����� �ν��Ͻ��� Health�� �����Ͽ� ���ҽ����ָ� ��
	}
	public void BasicAttack(Human name,int Power)
	{
		AttackM(name,Power);
		
	}
	//���� ��ų�� �� �� ���߿� ����
	//���ͼ���
}
//���Ͱ� ������ �ϴ� �� ���鶧 �޴� �ν��Ͻ��� human���� �޾Ƶ� �ǳ�? human�� ü���� ��õǾ� �ִ°Ŵϳ�
//�ɵ�
