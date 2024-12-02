package student.OrdersApi.Prezenter;

import student.OrdersApi.IRepairState;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;
import student.OrdersApiModel.OrdersApiModel.RepairState;

public class RepairService {

	private IRepairCreator repairCreator;

	public IRepairModel CreateRepair(int deviceId) {
		IRepairState state = new RepairState();
		IDeviceModel device = state.SelectDevice(deviceId);

		if (device.IsGuarantee()) {
			System.out.println("Create guarantee creator\n");
			repairCreator = new GuaranteeRepairCreator();
			return repairCreator.CreateRepair(device);
		}
		System.out.println("Create simple creator\n");
		repairCreator = new RepairCreator();
		return repairCreator.CreateRepair(device);
	}
}