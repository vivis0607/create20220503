//Generic06.java

//Ŭ������ ������� : ����, �޼ҵ��� ���� �� ����, ������
//�������̽��� �������: �޼ҵ��� ����
public class Generic06 {
	public static void main(String[] args) {
		//�������̽��� ��ü������ �Ұ����ϴ�.
		//�������̽��� ����Ϸ���
		//��ȸ������ �������̽��� ������ Ŭ������ ���ؼ� ����ؾ��Ѵ�.
		//Eatable e1 = new Eatable();
		EatA e1 = new EatA();
		Eatable e2 = new EatA();
		//1��°�� 2��°�� ����
		//��üŬ������ �ٲܶ� ���� new EatA();�� Ŭ������ �ٲ��ָ�ȴ�.
		
	}
}

interface Eatable{ //�����ڰ� ����!!!
	void eat();
}
interface superEatable extends Eatable{
	void superEat();
}

class EatC implements superEatable{

	@Override
	public void eat() {
		
	}

	@Override
	public void superEat() {
		
	}
	
}

class EatA implements Eatable{
	@Override
	public void eat() {
		
	}
	
}
class EatB implements Eatable{
	@Override
	public void eat() {
		
	}
}
//�������̽��� Ÿ�� ���ڸ� ����
//Eatable �������̽��� ��ӹ��� �������̽��� �� �� �ִ�.

//Eatable �������̽��� ��ӹ��� �������̽��� ������ Ŭ������ �� �� �ִ�.
//Eatable �������̽��� ������ Ŭ����+
//SuperEatable �������̽��� ������ Ŭ����
class GenericEat<T extends Eatable>{ 
	public T data;

	public void setData(T data) { //EatA, EatB, EatC
		this.data = data;
		data.eat();
	}
	public T getData() {
		return data;
	}
	
}