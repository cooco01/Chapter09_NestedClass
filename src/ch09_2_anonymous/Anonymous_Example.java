package ch09_2_anonymous;

public class Anonymous_Example {
	public static void main(String[] args) {
		Anonymous_ anony = new Anonymous_();
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTv�� �մϴ�");
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV�� ���ϴ�");
				}
			}
		);
	}
}
