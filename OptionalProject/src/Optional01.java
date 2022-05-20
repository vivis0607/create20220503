import java.util.Optional;
import java.util.function.Consumer;

public class Optional01 {
	public static void main(String[] args) {
		String name1 = "java";
		String name2 = null;
		
		//null을 허용하지 않습니다.
		Optional<String> box1 = Optional.of(name1);
		
		//null을 허용합니다.
		Optional<String> box2 = Optional.ofNullable(name1);
		
		//박스에 데이터 있으면 ...
		if(box2.isPresent()) {
			System.out.println(box2.get());
		}
		System.out.println();
		//박스에 데이터 있으면..
		//매개변수 : Consumer<Stirng> action : 함수형 인터페이스
		//구현해야하는 메소드가 딱하나!
		//void accept(T t)
		Consumer<String> c = s ->System.out.println(s);
		box2.ifPresent(c);
		System.out.println();
		box2.ifPresent(s ->System.out.println(s));
		box2.ifPresent(System.out::println);// 메소드 참조
		
		
	}
}
