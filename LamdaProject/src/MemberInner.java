
public class MemberInner {
	public static void main(String[] args) {
		Outer02 o1 = new Outer02();
		Outer02 o2 = new Outer02();
		
		Outer02.Member m1 = o1.new Member();
		Outer02.Member m2 = o2.new Member();
		
		m1.add(10);
		m2.get();// 0을 리턴한다. 객체는 각각 별개이기때문에, 앞전엔 변수에 static인 공용변수가 붙어서 리턴값이 10이 나온거다
	}
}

class Outer02{
	private int num = 0;
	
	class Member{
		public void add(int n) {
			num = num + n;
		}
		
		public int get() {
			return num;
		}
	}
}

class Outer03{
	private int num = 0;
	
	public void getMemberInstance() {
		class Member{
			public void add(int n) {
				num = num + n;
			}
		}
	}
	
}
