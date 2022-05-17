interface ReturnCal{
	int cal(int a, int b);
}

public class Lamda4 {
	public static void main(String[] args) {
		ReturnCal c1 = new ReturnCal() {
			public int cal(int a, int b) {
				return a+b;
			}
		};
		c1.cal(1, 2);
		
		ReturnCal c2 = (a, b)->{
			return a+b;
		};
		System.out.println(c2.cal(2, 3));
		
		//더줄이면 이렇게 된다, 1줄이라 중괄호 지우고, return을 지운다.
		ReturnCal c3 = (a, b)-> a+b;
		System.out.println(c3.cal(2, 3));
	}
}
