package ch09_2_example;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			public void onSelect() {
				System.out.println("배경을 변경합니다");
			}
		});
		checkBox.select();
	}
}
