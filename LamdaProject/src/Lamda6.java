import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface MyRandom{
	int rand(); //랜덤한 정수를 리턴
}
public class Lamda6 {
	public static void main(String[] args) {
		//매개변수가 없을땐 ()로 대체, 내용부가 2줄이라 중괄호가 들어간다.
		MyRandom r = () -> {
			Random rand = new Random();
			return rand.nextInt(100);
		};
		System.out.println(r.rand());
		
		
		List<String> strList = new ArrayList<String>();
		strList.add("java");
		strList.add("python");
		strList.add("c++");
		
		for(int i = 0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		for(String e: strList) {
			System.out.println(e);
		}
		strList.forEach(s->System.out.println(s+"!!"));
		//strList.forEach(Consumer<? super String> action);
	}
}
