package ch09_2_example;

public class AnonyExample {
	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.field.run();
		anony.method1();
		anony.method2(
			new Vehicle() {
				public void run() {
					System.out.println("트럭이 달립니다");
				}		
			}
		);
	}
}
