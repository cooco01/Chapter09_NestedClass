package ch09_1_inner;

public class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메세지를 보냈습니다");
	}
}
