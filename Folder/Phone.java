package seven_2;

public class Phone {
	Service service;
	Pcs pcs;
	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Pcs getPcs() {
		return pcs;
	}
	public void setPcs(Pcs pcs) {
		this.pcs = pcs;
	}
	
	public void print(){
		System.out.println("使用服务商："+service.getProvider()+"--卡的类型是："+pcs.getType());
	}
}
