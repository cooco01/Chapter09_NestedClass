package ch09_1_inner;

public class Button {
	OnClickListener listener; // > �������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); // ���� ��ü�� onclick �޼ҵ� ȣ��
	}
	static interface OnClickListener { // ��ø �������̽�
		void onClick();
	}
}
