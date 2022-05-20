import java.util.Optional;

public class Optional03 {
	public static void main(String[] args) {
		Optional<String> box1 = Optional.ofNullable("Optional String");
		//Function<? super String, ? extends String> mapper
		//Function<String, String> mapper
		//U apply(T t)
		Optional<String> box2 = box1.map(s->s.toUpperCase());
		System.out.println(box2.get());
		
		Optional<String> box3 = box1.map(s -> s.replace(' ' , '_'))//"Optional_String"이런문자열이 박스에 감싸져잇다.
									.map(s->s.toLowerCase());
		System.out.println(box3.get());
	}
}
