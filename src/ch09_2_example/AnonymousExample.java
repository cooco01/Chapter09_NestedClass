package ch09_2_example;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(
			new Worker() {
				void start() {
					System.out.println("�׽�Ʈ�� �մϴ�");
				}
			}
		);
	}
}