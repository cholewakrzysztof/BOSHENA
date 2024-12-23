package student.MainPrezenter;

import student.MainPrezenter.ICreateOrderStrategy;
import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public class CreateOrderContext {

	private ICreateOrderStrategy strategy;

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		return this.strategy.CreateOrder(device, order, workerId, clientId);
	}

	/**
	 * 
	 * @param strategy
	 */
	public void SetStrategy(ICreateOrderStrategy strategy) {
		this.strategy = strategy;
	}

}