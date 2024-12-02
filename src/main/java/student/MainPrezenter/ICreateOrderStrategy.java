package student.MainPrezenter;


public interface ICreateOrderStrategy {

	/**
	 * 
	 * @param device
	 * @param order
	 * @param workerId
	 * @param clientId
	 */
	OrdersApiModel.OrdersApiModel.IOrderModel CreateOrder(OrdersApiModel.OrdersApiModel.IDeviceModel device, OrdersApiModel.OrdersApiModel.IOrderModel order, int workerId, int clientId);

}