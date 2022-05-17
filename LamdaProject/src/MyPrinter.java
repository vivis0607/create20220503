interface Printable{
	void print();
}
public class MyPrinter{
	public Printable getPrinter() {
		class SamsungPrinter implements Printable {
			public void print() {
				System.out.println("프린트 실행");
			}
		}
		return new SamsungPrinter();
	}
}

class MyPrinter1{
	public Printable getPrinter() {
		
		return new Printable() { //이게 익명 클래스이다.
			public void print() {
				System.out.println("프린트 실행");
			}
		};
	}
}

