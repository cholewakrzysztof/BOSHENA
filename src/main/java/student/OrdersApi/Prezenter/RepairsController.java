package student.OrdersApi.Prezenter;

import student.OrdersApi.IRepairsClient;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;

public class RepairsController implements IRepairsClient {

	/**
	 * 
	 * @param device
	 */
	public int CreateDevice(IDeviceModel device) {
		System.out.println("Create device success");
		return 1;
	}

	/**
	 * 
	 * @param deviceId
	 */
	public int CreateRepair(int deviceId) {
		IRepairProvider provider = new RepairProvider();
		return provider.CreateRepair(deviceId);
	}

}