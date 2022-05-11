//Generic06.java

//클래스의 구성요소 : 변수, 메소드의 정의 및 구현, 생성자
//인터페이스이 구성요소: 메소드의 정의
public class Generic06 {
	public static void main(String[] args) {
		//인터페이스는 객체생성이 불가능하다.
		//인터페이스를 사용하려면
		//우회적으로 인터페이스를 구현한 클래스를 통해서 사용해야한다.
		//Eatable e1 = new Eatable();
		EatA e1 = new EatA();
		Eatable e2 = new EatA();
		//1번째와 2번째의 차이
		//객체클래스를 바꿀때 뒤의 new EatA();의 클래스명만 바꿔주면된다.
		
	}
}

interface Eatable{ //생성자가 없음!!!
	void eat();
}
interface superEatable extends Eatable{
	void superEat();
}

class EatC implements superEatable{

	@Override
	public void eat() {
		
	}

	@Override
	public void superEat() {
		
	}
	
}

class EatA implements Eatable{
	@Override
	public void eat() {
		
	}
	
}
class EatB implements Eatable{
	@Override
	public void eat() {
		
	}
}
//인터페이스로 타입 인자를 제한
//Eatable 인터페이스를 상속받은 인터페이스만 올 수 있다.

//Eatable 인터페이스를 상속받은 인터페이스를 구현한 클래스만 올 수 있다.
//Eatable 인터페이스를 구현한 클래스+
//SuperEatable 인터페이스를 구현한 클래스
class GenericEat<T extends Eatable>{ 
	public T data;

	public void setData(T data) { //EatA, EatB, EatC
		this.data = data;
		data.eat();
	}
	public T getData() {
		return data;
	}
	
}