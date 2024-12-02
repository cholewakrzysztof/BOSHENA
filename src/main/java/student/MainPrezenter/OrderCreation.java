package student.MainPrezenter;


import student.OrdersApiModel.OrdersApiModel.IDeviceModel;
import student.OrdersApiModel.OrdersApiModel.IOrderModel;

public class OrderCreation {

	CreateOrderContext orderContext;

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	public IOrderModel CreateOrder(IDeviceModel device, IOrderModel order, int workerId, int clientId) {
		return this.orderContext.CreateOrder(device, order, workerId, clientId);
	}

	/**
	 * 
	 * @param strategy
	 */
	public void SetStrategy(ICreateOrderStrategy strategy) {
		this.orderContext = new CreateOrderContext();
		orderContext.SetStrategy(strategy);
		System.out.println("Strategy set to: " + strategy.ToString());
	}

}