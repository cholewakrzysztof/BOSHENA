package student.OrdersApiModel.OrdersApiModel;

import java.util.Date;

public class RepairModel implements IRepairModel {

	private DevicePart[] Fixed;
	private DevicePart[] Broken;
	private Date StartDate;
	private int ID;
	private static int _id = 0;

	public RepairModel(DevicePart[] fixed, DevicePart[] broken, Date date) {
		this.Broken = broken;
		this.Fixed = fixed;
		this.StartDate = date;
		_id++;
		this.ID = _id;
	}

	@Override
	public int GetId() {
		return this.ID;
	}
}