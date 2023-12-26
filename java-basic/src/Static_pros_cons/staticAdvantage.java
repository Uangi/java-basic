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
		increment();					// ��ü ���� �޼��忡 ���� ����.
		System.out.println(getCount());
		staticWeakness.getWeak();
		System.out.println(staticWeakness.getWeak());
		
	}
	
}

/*
  ����
  1. ���� �ڿ� : static���� ����� ������ �޼���� Ŭ���� �Ǵ� ��ü�� �������
 * ���� �� �� �ִ�. ��� �̸� ���� ���� ��ü ���� ���¸� ����,
 * ������ ������ �����ϴµ� ���� �� ����.
 * 
 * 2. ���� ���� : static ������� Ŭ���� �̸��� ���� ���������� ������ �����ϴ�.
 * ��ü �������� �ٷ� ��� ������.
 * 
 * 3. ����� �Բ� ����� �� ȿ������ - private static final.
 * */

/*
 * ���� 
 * 1) ���� ���� ������ ����� : static ������ ���� ���¸� ��Ÿ�� �� �ִµ�(�� Ŭ���� ������ �����Ӱ� ��밡��.) ����
 * ������ ���� ���� �Ǵ� ��� ����ȭ ������ �Ͼ �� �ִ�.
 * 
 * 2) �׽�Ʈ ����� : static �޼���� ������ �׽�Ʈ�ϱ� ����� �� �ִ�. ������ ����, mocking�� ������� �� �ִ�.
 * 
 * 3) ��ü ���� ��Ģ ���� : ��ü ������ ��ü �� �޽��� ������ ���� ��ȣ�ۿ��ؾ� �ϴµ� �̷��� ��Ģ�� ����.
 * 
 */
