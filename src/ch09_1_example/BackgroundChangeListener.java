package ch09_1_example;

public class BackgroundChangeListener implements CheckBox.OnSelectListener{
	public void onSelect() {
		System.out.println("배경을 변경합니다");
	}
}
