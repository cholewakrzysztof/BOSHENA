package student.OrdersApi;

import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;

public interface IRepairState {

	/**
	 * 
	 * @param repair
	 */
	boolean InsertRepair(IRepairModel repair);

	/**
	 * 
	 * @param repair
	 */
	int UpdateRepair(IRepairModel repair);

	IDeviceModel SelectDevice(int deviceId);

}