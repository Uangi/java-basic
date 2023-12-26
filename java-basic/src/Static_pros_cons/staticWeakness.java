package Static_pros_cons;

public class staticWeakness {

	public static int getWeak() {
		int weak = 0;
		return weak = staticAdvantage.count + 1;	// 인스턴스 없이 필드에 직접 개입
	}

}
