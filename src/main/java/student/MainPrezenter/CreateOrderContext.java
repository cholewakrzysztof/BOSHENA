package student.MainPrezenter;

import student.MainPrezenter.ICreateOrderStrategy;

public class CreateOrderContext {

	private ICreateOrderStrategy strategy;

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	public OrdersApiModel.OrdersApiModel.IOrderModel CreateOrder(OrdersApiModel.OrdersApiModel.IDeviceModel device, OrdersApiModel.OrdersApiModel.IOrderModel order, int workerId, int clientId) {
		// TODO - implement CreateOrderContext.CreateOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param strategy
	 */
	public void SetStrategy(ICreateOrderStrategy strategy) {
		// TODO - implement CreateOrderContext.SetStrategy
		throw new UnsupportedOperationException();
	}

}