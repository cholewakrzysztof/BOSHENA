package student.OrdersApi;

import student.OrdersApiModel.OrdersApiModel.IDeviceModel;

public interface IRepairsClient {

	/**
	 * 
	 * @param device
	 */
	int CreateDevice(IDeviceModel device);

	/**
	 * 
	 * @param deviceId
	 */
	int CreateRepair(int deviceId);

}