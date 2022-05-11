
public class Generic04 {
	public static void main(String[] args) {
		
	}
}


//제네릭 클래스의 타입 인자 제한
class GenericBox1<T>{
	private T obj;
	
	//문자열의 길이를 출력
	public void set(T obj) {//Object 클래스에서 선언된 메소드
		//obj.length(); // obj가 무조건 문자열이 아니라서 안됨
		obj.toString();
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}