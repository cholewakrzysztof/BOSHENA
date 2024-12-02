package student;

public interface IOrderscClient {

	/**
	 * 
	 * @param order
	 */
	int CreateOrder(OrdersApiModel.OrdersApiModel.IOrderModel order);

}