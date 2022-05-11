
public class Generic05 {
	public static void main(String[] args) {
//		GenericPhone<String> g1 = new GenericPhone<>(); --Ÿ���������ѿ��� ����� ������ ��
		GenericPhone<Phone> g2 = new GenericPhone<>();
		GenericPhone<SmartPhone> g3 = new GenericPhone<>();
	}
}

class Phone{
	public void sendMsg() {
		System.out.println("�޼����� �����ϴ�1");
	}
	
	public void call() {
		System.out.println("��ȭ�� �޴´�");
	}
}

class SmartPhone extends Phone{
	public void playApp() {
		System.out.println("���� �����մϴ�");
	}
}

//Ÿ�����ڸ� ����(��Ӱ��踦 ���� ����, �������̽��� ����)
class GenericPhone<T extends Phone>{ //Phone�� Phone�� �ڽĵ鸸 ���� �� �ִ�.
	public T data;

	public void setData(T data) {
		this.data = data;
		data.sendMsg(); //T�� smartPhone�� Phone�� ������ �� �޼ҵ带 ���డ���ϴ�.
	}
	public T getData() {
		return data;
	}
	
}