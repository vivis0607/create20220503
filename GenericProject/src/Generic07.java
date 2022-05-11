
public class Generic07 {
	public static void main(String[] args) {
		GenericMethod g = new GenericMethod();
		g.<Integer>set(10);
		
		BoxFactory bf = new BoxFactory();
		MyBox<String> strBox = bf.<String>makeBox("java");
	}
}
//제네릭클래스
//일반클래스에서 메소드 한 두번만 제네릭화 할 수도 있음
//클래스 전체를 제네릭화 할 수도 있지만,
//클래스에서 일부분의 메소드만 제네릭화 할 수도 있다.
//일부분의 메소드만 제네릭화 할 때에는
//클래스가 제네릭이라고 명시해주는 <T>를 삭제하고
//제네릭화 하고자 하는 메소드의 리턴타입 앞에 <T>를 붙여준다.
class GenericMethod{ 
	public <T> void set(T data) { 
//		this.data = data;
	}
	public <T> T get() {
		return null;
	}
	
}

//어떤 데이터 타입이 들어오더라도
//그 데이터 타입을 박스에 포장해서
//리턴시켜주는 기능
class BoxFactory{
	public <T> MyBox<T> makeBox(T object) {
		MyBox<T> box = new MyBox<>();
		box.setBox(object);
		
		return box;
	}
}

//무엇이든 포장할 수 있는 박스
class MyBox<T>{
	private T obj;
	
	public void setBox(T obj) {
		this.obj = obj;
	}
}