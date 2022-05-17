interface HowLong{
	int len(String s);// 매개변수로 들어온 문자열의 길이를 반환
}
public class Lamda5 {
	public static void main(String[] args) {
		HowLong h = s-> s.length();
		System.out.println(h.len("java"));
	}
}
