package student.OrdersApi.Prezenter;

public interface IRepairCreator {

	/**
	 * 
	 * @param device
	 */
	OrdersApiModel.OrdersApiModel.IRepairModel CreateRepair(OrdersApiModel.OrdersApiModel.IDeviceModel device);

}