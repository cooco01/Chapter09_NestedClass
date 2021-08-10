package ch09_1_inner;

public class Button {
	OnClickListener listener; // > 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); // 구현 객체의 onclick 메소드 호출
	}
	static interface OnClickListener { // 중첩 인터페이스
		void onClick();
	}
}
