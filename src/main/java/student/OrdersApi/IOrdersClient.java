package student.OrdersApi;


import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public interface IOrdersClient {

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId);

}