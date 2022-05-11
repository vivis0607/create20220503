
//좋은 코드란?
//런타임 오류보다 컴파일 오류가 좋다.
public class Generic02 {
	public static void main(String[] args) {
		Box box = new Box();
		box.set(new Apple());
		
//		Apple apple = box.get(); 
		//--오류가 난다. 사실은 뒤의 box.get();의 자료형이 Object라서 에러난다.
		
		Apple apple = (Apple)box.get(); //강제로 형변환 시키면 되긴한다.
		
		//졸면 이지랄난다..
		box.set("apple"); 
		Apple apple1 = (Apple)box.get();
		System.out.println(apple1);

		//이상황을 방지하기위해서!!
		//Generic03으로 넘어간닷
		
		
	}
}
