package ch09_2_example;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}
