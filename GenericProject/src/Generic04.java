
public class Generic04 {
	public static void main(String[] args) {
		
	}
}


//���׸� Ŭ������ Ÿ�� ���� ����
class GenericBox1<T>{
	private T obj;
	
	//���ڿ��� ���̸� ���
	public void set(T obj) {//Object Ŭ�������� ����� �޼ҵ�
		//obj.length(); // obj�� ������ ���ڿ��� �ƴ϶� �ȵ�
		obj.toString();
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}