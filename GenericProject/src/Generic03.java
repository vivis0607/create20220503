import java.util.ArrayList;
import java.util.List;

public class Generic03 {
	public static void main(String[] args) {
		GenericBox<Apple> appleBox = new GenericBox<Apple>();
		appleBox.set(new Apple());
//		appleBox.set("apple"); 이러면 에러가 생긴다. 졸아도 빨간줄띄워준닷!
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
// GenericBox<T>에서 T: 타입 매개변수
// GenericBox<Apple> 에서 Apple : 타입인자
// GenericBox<Apple> : 매개변수화 타입
class GenericBox<T>{
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}
