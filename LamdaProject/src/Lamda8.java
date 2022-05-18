//함수형 인터페이스 : 메소드가 하나만 존재

@FunctionalInterface //이거 건들지 마세요. 오류나면 XXXXX
interface MyCal1<T>{
	T cal(T a, T b);
}

//주는 자료형과 받는 자료형의 타입이 다를땐 아래와같이 두개를 넣어준다.
@FunctionalInterface
interface MyCal2<T, R>{
	R cal(T a, T b);
}

public class Lamda8 {
	public static void main(String[] args) {
		//정수 두개의 합을 출력
		MyCal1<Integer> c1 = (a, b) -> a+b;
		System.out.println(c1.cal(10, 20));
		
		//매개변수로 문자열 두개.
		//리턴으로 두 문자열의 길이의 차를 리턴
		//abcde, abc ->2
		MyCal2<String, Integer> c2 =
				(a, b) -> a.length() - b.length();
		System.out.println(c2.cal("hello", "java")); 
	}
}
