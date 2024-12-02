package student.OrdersApiModel.OrdersApiModel;

import java.util.concurrent.locks.Condition;

public class DeviceModel implements IDeviceModel {

	private String Mark;
	private DeviceCondition Condition;
	private String Comment;

	public DeviceModel(String mark, DeviceCondition condition, String comment) {
		this.Comment = comment;
		this.Condition = condition;
		this.Mark = mark;
	}
}