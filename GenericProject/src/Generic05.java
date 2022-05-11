
public class Generic05 {
	public static void main(String[] args) {
//		GenericPhone<String> g1 = new GenericPhone<>(); --타입인자제한에서 벗어나서 오류가 남
		GenericPhone<Phone> g2 = new GenericPhone<>();
		GenericPhone<SmartPhone> g3 = new GenericPhone<>();
	}
}

class Phone{
	public void sendMsg() {
		System.out.println("메세지를 보냅니다1");
	}
	
	public void call() {
		System.out.println("전화를 받는다");
	}
}

class SmartPhone extends Phone{
	public void playApp() {
		System.out.println("앱을 실행합니다");
	}
}

//타입인자를 제한(상속관계를 통한 제한, 인터페이스로 제한)
class GenericPhone<T extends Phone>{ //Phone과 Phone의 자식들만 들어올 수 있다.
	public T data;

	public void setData(T data) {
		this.data = data;
		data.sendMsg(); //T가 smartPhone과 Phone이 들어오면 이 메소드를 실행가능하다.
	}
	public T getData() {
		return data;
	}
	
}