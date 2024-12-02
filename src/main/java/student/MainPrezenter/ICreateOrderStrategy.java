package student.MainPrezenter;


import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public interface ICreateOrderStrategy {

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId);

	String ToString();
}