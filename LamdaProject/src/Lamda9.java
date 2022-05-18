import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//정의되어 있는 함수형 인터페이스
//Predicate<T> : boolean test(T t);  --입증하다
//Supplier<T> : T get(); -- 제공하다
//Consumer<T> :  void accept(T t); --소비자 :  
//Function<T, R> : R apply(T t); --그냥 기본 함수
//BiFunction<T,U,R> : R apply(T t, U u)
public class Lamda9 {
	public static void main(String[] args) {
		//매개변수로 들어오는 정수가
		//짝수면 true, 홀수면 false
		Predicate<Integer> isEven = 
				(num)-> num%2==0?true:false;
		System.out.println(isEven.test(5));
		if(isEven.test(10)) {
			System.out.println("짝수!");
		}
		
		//0~100의 랜덤한 정수를 리턴
		Supplier<Integer> ram =
				()->{
					Random r = new Random();
					return r.nextInt(100);
				};
		System.out.println(ram.get());
		
		
		///////////////////////////////////
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//Consumer<T> :  void accept(T t); --소비자 :  
		Consumer<String> c = (str)->System.out.println(str);
		list.forEach(c);
		
		//위의 두줄을 한줄로 바꾸면 아래와 같이 된다.
		list.forEach((str)->System.out.println(str));
		
		//와일드카드의 하한제한: String 클래스와 String의 부모 클래스만 들어온다!
		//String이 들어온다. get 호출 불가.
		//list.forEach(Consumer<? super String> action);
		
	}

}


