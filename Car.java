package seven_1;

public class Car extends Vehicle implements Lock{

	@Override
	public void lockUp() {
		System.out.println("���Կ�ף�������ת��Ȧ�������ˣ��γ�Կ��");
		
	}

	@Override
	public void openLock() {
		System.out.println("���Կ�ף�������ת��Ȧ�������ˣ��γ�Կ��");
		
	}

	@Override
	public void run() {
		System.out.println("���������������棬��ʻԱ��ʻ�γ���ʼ��ʻ");
		
	}

	@Override
	public void stop() {
		System.out.println("��ʻԱ������Ϩ��׼�����Ͻγ�");
		
	}
	
}
