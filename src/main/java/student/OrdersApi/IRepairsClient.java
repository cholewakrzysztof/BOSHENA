package student.OrdersApi;

public interface IRepairsClient {

	/**
	 * 
	 * @param device
	 */
	int CreateDevice(OrdersApiModel.OrdersApiModel.IDeviceModel device);

	/**
	 * 
	 * @param deviceId
	 */
	int CreateRepair(int deviceId);

}