package student.OrdersApi.Prezenter;

import student.OrdersApi.IOrdersClient;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public class OrdersController implements IOrdersClient {

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		// TODO - implement OrdersController.CreateOrder
		throw new UnsupportedOperationException();
	}

}