package student.OrdersApi.Prezenter;

import student.OrdersApiModel.OrdersApiModel.IDeviceModel;

public interface IRepairCreator {

	/**
	 * 
	 * @param device
	 */
	IRepairModel CreateRepair(IDeviceModel device);

}