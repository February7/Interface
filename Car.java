package seven_1;

public class Car extends Vehicle implements Lock{

	@Override
	public void lockUp() {
		System.out.println("插进钥匙，向左旋转三圈，锁上了，拔出钥匙");
		
	}

	@Override
	public void openLock() {
		System.out.println("插进钥匙，向右旋转三圈，锁打开了，拔出钥匙");
		
	}

	@Override
	public void run() {
		System.out.println("开完锁，发动引擎，驾驶员驾驶轿车开始行驶");
		
	}

	@Override
	public void stop() {
		System.out.println("驾驶员发动机熄火，准备锁上轿车");
		
	}
	
}
