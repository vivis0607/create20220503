
interface Msg{ //통상적으로 인터페이스명뒤에 able을 붙인다.
	void sendMsg(String s);
}

class MyPhone implements Msg{
	public void sendMsg(String s) {
		System.out.println(s);
	}
	
}

public class Lamda1 {
	public static void main(String[] args) {
		//인터페이스 사용의 정석
		MyPhone p1 = new MyPhone();
		p1.sendMsg("java");
		
		//익명클래스 활용
		Msg p2 = new Msg() {
			public void sendMsg(String s) {
				System.out.println(s);
			}
		};
		p2.sendMsg("java");
		
		//람다 적용
		Msg p3 = (s) -> {
			System.out.println(s);
		};
		p3.sendMsg("java");
	}
}
