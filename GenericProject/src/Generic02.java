
//���� �ڵ��?
//��Ÿ�� �������� ������ ������ ����.
public class Generic02 {
	public static void main(String[] args) {
		Box box = new Box();
		box.set(new Apple());
		
//		Apple apple = box.get(); 
		//--������ ����. ����� ���� box.get();�� �ڷ����� Object�� ��������.
		
		Apple apple = (Apple)box.get(); //������ ����ȯ ��Ű�� �Ǳ��Ѵ�.
		
		//���� ����������..
		box.set("apple"); 
		Apple apple1 = (Apple)box.get();
		System.out.println(apple1);

		//�̻�Ȳ�� �����ϱ����ؼ�!!
		//Generic03���� �Ѿ��
		
		
	}
}
