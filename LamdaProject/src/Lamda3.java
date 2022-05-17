
public class Lamda3 {
	public static void main(String[] args) {
		Calculate c1 = (int a, int b) -> {
			System.out.println(a+b);
		};
		c1.cal(5, 10);
		
		Calculate c2 = (a, b) ->{
			System.out.println(a-b);
		};
		c2.cal(5, 1);
	}
}
