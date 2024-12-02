package student.OrdersApiModel.OrdersApiModel;

import java.sql.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;


public class DeviceModel implements IDeviceModel {

	private String Mark;
	private DeviceCondition Condition;
	private String Comment;
	private boolean guarentee;
	private int Id;
	private DevicePart[] parts;

	public DeviceModel(String mark, DeviceCondition condition, String comment, boolean guarentee, int id, DevicePart[] deviceParts) {
		this.Comment = comment;
		this.Condition = condition;
		this.Mark = mark;
		this.guarentee = guarentee;
		this.Id = id;
		this.parts = deviceParts;
	}

	@Override
	public boolean IsGuarantee() {
		return this.guarentee;
	}

	@Override
	public int GetId() {
		return this.Id;
	}

	@Override
	public DevicePart[] GetBrokenParts() {
		List<DevicePart> parts = new LinkedList<DevicePart>();
		for (DevicePart part : this.parts)
			if (part.broken)
				parts.add(part);

		DevicePart[] array = new DevicePart[parts.size()];
		return parts.toArray(array);
	}

	@Override
	public DevicePart[] GetGoodPars() {
		List<DevicePart> parts = new LinkedList<DevicePart>();
		for (DevicePart part : this.parts)
			if (!part.broken)
				parts.add(part);

		DevicePart[] array = new DevicePart[parts.size()];
		return parts.toArray(array);
	}
}