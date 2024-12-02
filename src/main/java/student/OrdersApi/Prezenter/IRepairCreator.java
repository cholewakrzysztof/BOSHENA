package student.OrdersApi.Prezenter;

import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IRepairModel;

public interface IRepairCreator {

	/**
	 * 
	 * @param device
	 */
	IRepairModel CreateRepair(IDeviceModel device);
}