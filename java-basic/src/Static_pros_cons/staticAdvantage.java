package Static_pros_cons;

public class staticAdvantage {

	protected static int count = 3;
	
	private static void increment() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		increment();					// 객체 없이 메서드에 직접 개입.
		System.out.println(getCount());
		staticWeakness.getWeak();
		System.out.println(staticWeakness.getWeak());
		
	}
	
}

/*
  장점
  1. 공유 자원 : static으로 선언된 변수나 메서드는 클래스 또는 객체와 관계없이
 * 공유 될 수 있다. 대신 이를 통해 여러 객체 간에 상태를 공유,
 * 동일한 동작을 수행하는데 사용될 수 있음.
 * 
 * 2. 편리성 접근 : static 멤버들은 클래스 이름을 통해 직접적으로 접근이 가능하다.
 * 객체 생성없이 바로 사용 가능함.
 * 
 * 3. 상수와 함께 사용할 때 효과적임 - private static final.
 * */

/*
 * 단점 
 * 1) 전역 상태 관리의 어려움 : static 변수는 전역 상태를 나타낼 수 있는데(한 클래스 내에서 자유롭게 사용가능.) 여러
 * 쓰레드 간에 공유 되는 경우 동기화 문제가 일어날 수 있다.
 * 
 * 2) 테스트 어려움 : static 메서드와 변수는 테스트하기 어려울 수 있다. 의존성 주입, mocking이 어려워질 수 있다.
 * 
 * 3) 객체 지향 원칙 위배 : 객체 지향은 객체 간 메시지 전달을 통해 상호작용해야 하는데 이러한 원칙을 깬다.
 * 
 */
