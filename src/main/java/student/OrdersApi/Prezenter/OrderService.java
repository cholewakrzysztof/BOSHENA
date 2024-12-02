package student.OrdersApi.Prezenter;

import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;
public class OrderService {

	private IOrderCreation orderCreationChain;

	/**
	 * 
	 * @param order
	 */
	public int CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		orderCreationChain = new CreateProcessor();
		return 0;
	}

	/**
	 * 
	 * @param order
	 */
	public int UpdateOrder(IOrderModel order) {
		// TODO - implement OrderService.UpdateOrder
		throw new UnsupportedOperationException();
	}

}