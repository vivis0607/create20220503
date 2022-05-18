
//Lamda란?
//인터페이스의 메소드 사용을 좀 더 간편하고,
//생산적이고, 실용적으로 사용할 수 있도록 제공하는 문법
//단, 사용하고자 하는 인터페이스 내에는
//반드시 메소드가 하나만 존재해야함.

interface MyConcat{
	void concat(String str1, String str2);
}
public class Lamda7 {
	public static void main(String[] args) {
		MyConcat c1 = (str1, str2)->System.out.println(str1+str2);
		c1.concat("hello!", "java");
	}
}
