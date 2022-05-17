
interface Calculate{
	void cal(int a, int b);
}
class MyCal implements Calculate{
	public void cal(int a, int b) {
		System.out.println(a+b);
	}
}

public class Lamda2 {
	public static void main(String[] args) {
		Calculate c = new Calculate() {
			public void cal(int a, int b) {
				System.out.println(a+b);
			}
		};
		c.cal(5, 10);
		
		Calculate c1 = (int a, int b) -> {
			System.out.println(a+b);
		};
		c1.cal(5, 10);
	}
}
