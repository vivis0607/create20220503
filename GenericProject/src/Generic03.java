import java.util.ArrayList;
import java.util.List;

public class Generic03 {
	public static void main(String[] args) {
		GenericBox<Apple> appleBox = new GenericBox<Apple>();
		appleBox.set(new Apple());
//		appleBox.set("apple"); �̷��� ������ �����. ���Ƶ� �����ٶ���ش�!
		Apple ap = appleBox.get();
		
		GenericBox<Orange> orangeBox = new GenericBox<Orange>();
		orangeBox.set(new Orange());
		
		List<String> list = new ArrayList<>();
//		list.forEach(Consumer<? super String> action);
	}
}

// T : type
// E : element
// K : key
// V : value
// GenericBox<T>���� T: Ÿ�� �Ű�����
// GenericBox<Apple> ���� Apple : Ÿ������
// GenericBox<Apple> : �Ű�����ȭ Ÿ��
class GenericBox<T>{
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}
