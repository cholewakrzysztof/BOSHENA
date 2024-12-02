package student.OrdersApi;

public interface IOrderState {

	/**
	 * 
	 * @param order
	 */
	boolean InsertOrder(OrdersApiModel.OrdersApiModel.IOrderModel order);

	/**
	 * 
	 * @param order
	 */
	int UpdateOrder(OrdersApiModel.OrdersApiModel.IOrderModel order);

	/**
	 * 
	 * @param orderId
	 */
	OrdersApiModel.OrdersApiModel.IOrderModel GetOrderById(int orderId);

	/**
	 * 
	 * @param orderId
	 */
	OrdersApiModel.OrdersApiModel.IOrderModel DeleteOrder(int orderId);
}