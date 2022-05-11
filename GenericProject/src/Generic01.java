
//Generic
//프로그램 : 데이터(변수)+기능(메소드)

public class Generic01 {
	public static void main(String[] ar) {
		AppleBox aBox = new AppleBox();
		aBox.set(new Apple());
		System.out.println(aBox.get());
		
//		aBox.set(new Orange()); --자료형이 달라서 안됨
		
		Box superBox = new Box();
		superBox.set(new Apple());
		System.out.println(superBox.get());
		
		//다형성, 오버라이딩, toString()
		superBox.set(new Orange());
		System.out.println(superBox.get());
		
		//다형성 : extend(상속)과 내용이 연결된다. 부모자료형으로 자식자료형을 받을수 있다.
		//객체의 실체 : orange
		//다형성을 사용해서 만든 객체는 본인의 메소드를 호출하지 못함.
		Object o = new Orange(); 
//		o.aaa(); -- 오렌지 안의 메소드를 불러오지 못한다.
		Orange o1 = new Orange();
		o1.aaa();
		
		//오버로딩
		//원래 메소드의 명은 중복이 불가하지만,
		//메소드의 매개변수(개수, 자료형)이 다르면
		//메소드명을 동일하게 생성하는 것을 허용
		
		//오버라이딩
		//상속관계에서 부모클래스에 있는 메소드를 자식 클래스에서
		//재정의 할 수 있다.
		//부모와 자식 클래스에 동일한 메소드가
		//정의되어 있다면, 자식 클래스의 객체는 
		//부모클래스의 메소드를 호출하지 못한다.
		
	}
}

class Apple{
	public String toString() {
		return "나는 사과~";
	}
}

class AppleBox{
	private Apple apple;
	
	public void set(Apple apple) {
		this.apple = apple;
	}
	public Apple get() {
		return apple;
	}
}

class Orange{
	public String toString() {
		return "나는 오렌지~";
	}
	public void aaa() {
		System.out.println("aaa");
	}
}

class OrangeBox{
	private Orange orange;
	
	public void set(Orange orange) {
		this.orange = orange;
	}
	public Orange get() {
		return orange;
	}
}

class Box{
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}