
public class Generic07 {
	public static void main(String[] args) {
		GenericMethod g = new GenericMethod();
		g.<Integer>set(10);
		
		BoxFactory bf = new BoxFactory();
		MyBox<String> strBox = bf.<String>makeBox("java");
	}
}
//���׸�Ŭ����
//�Ϲ�Ŭ�������� �޼ҵ� �� �ι��� ���׸�ȭ �� ���� ����
//Ŭ���� ��ü�� ���׸�ȭ �� ���� ������,
//Ŭ�������� �Ϻκ��� �޼ҵ常 ���׸�ȭ �� ���� �ִ�.
//�Ϻκ��� �޼ҵ常 ���׸�ȭ �� ������
//Ŭ������ ���׸��̶�� ������ִ� <T>�� �����ϰ�
//���׸�ȭ �ϰ��� �ϴ� �޼ҵ��� ����Ÿ�� �տ� <T>�� �ٿ��ش�.
class GenericMethod{ 
	public <T> void set(T data) { 
//		this.data = data;
	}
	public <T> T get() {
		return null;
	}
	
}

//� ������ Ÿ���� ��������
//�� ������ Ÿ���� �ڽ��� �����ؼ�
//���Ͻ����ִ� ���
class BoxFactory{
	public <T> MyBox<T> makeBox(T object) {
		MyBox<T> box = new MyBox<>();
		box.setBox(object);
		
		return box;
	}
}

//�����̵� ������ �� �ִ� �ڽ�
class MyBox<T>{
	private T obj;
	
	public void setBox(T obj) {
		this.obj = obj;
	}
}