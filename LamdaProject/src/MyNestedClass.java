
public class MyNestedClass {
	public static void main(String[] args) {
		
		//객체 생성
		Outer01.Nested01 n1 = new Outer01.Nested01();
		Outer01.Nested02 n2 = new Outer01.Nested02();
		
		n1.add(10);
		System.out.println(n2.get()); //--10이 도출
		
	}
}

class Outer01{
	static int num = 0;
	
	static class Nested01{
		public void add(int n) {
			num = num+n;
		}
	}
	
	static class Nested02{
		public int get() {
			return num;
		}
	}
	
	
}