package student.OrdersApiModel.OrdersApiModel;

public class DevicePart {

	private String Mark;
	private String SN;
	public boolean broken;

	public DevicePart(String mark, String SN, boolean br) {
		this.Mark = mark;
		this.SN = SN;
		this.broken = br;
	}

}