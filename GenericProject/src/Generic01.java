
//Generic
//���α׷� : ������(����)+���(�޼ҵ�)

public class Generic01 {
	public static void main(String[] ar) {
		AppleBox aBox = new AppleBox();
		aBox.set(new Apple());
		System.out.println(aBox.get());
		
//		aBox.set(new Orange()); --�ڷ����� �޶� �ȵ�
		
		Box superBox = new Box();
		superBox.set(new Apple());
		System.out.println(superBox.get());
		
		//������, �������̵�, toString()
		superBox.set(new Orange());
		System.out.println(superBox.get());
		
		//������ : extend(���)�� ������ ����ȴ�. �θ��ڷ������� �ڽ��ڷ����� ������ �ִ�.
		//��ü�� ��ü : orange
		//�������� ����ؼ� ���� ��ü�� ������ �޼ҵ带 ȣ������ ����.
		Object o = new Orange(); 
//		o.aaa(); -- ������ ���� �޼ҵ带 �ҷ����� ���Ѵ�.
		Orange o1 = new Orange();
		o1.aaa();
		
		//�����ε�
		//���� �޼ҵ��� ���� �ߺ��� �Ұ�������,
		//�޼ҵ��� �Ű�����(����, �ڷ���)�� �ٸ���
		//�޼ҵ���� �����ϰ� �����ϴ� ���� ���
		
		//�������̵�
		//��Ӱ��迡�� �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ��������
		//������ �� �� �ִ�.
		//�θ�� �ڽ� Ŭ������ ������ �޼ҵ尡
		//���ǵǾ� �ִٸ�, �ڽ� Ŭ������ ��ü�� 
		//�θ�Ŭ������ �޼ҵ带 ȣ������ ���Ѵ�.
		
	}
}

class Apple{
	public String toString() {
		return "���� ���~";
	}
}

class AppleBox{
	private Apple apple;
	
	public void set(Apple apple) {
		this.apple = apple;
	}
	public Apple get() {
		return apple;
	}
}

class Orange{
	public String toString() {
		return "���� ������~";
	}
	public void aaa() {
		System.out.println("aaa");
	}
}

class OrangeBox{
	private Orange orange;
	
	public void set(Orange orange) {
		this.orange = orange;
	}
	public Orange get() {
		return orange;
	}
}

class Box{
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}