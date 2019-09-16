package seven_2;

public class Test {
	public static void main(String[] args) {
		Service service = null;
		Pcs pcs = null;
		Phone phone = new Phone();
		//中国移动-4G
		service = new ChinaMobile();
		pcs = new Generation4();
		phone.setService(service);
		phone.setPcs(pcs);
		phone.print();
		
		//中国联通-5G
		service = new ChinaUnicom();
		pcs = new Generation5();
		phone.setService(service);
		phone.setPcs(pcs);
		phone.print();
		
		
	}
}
